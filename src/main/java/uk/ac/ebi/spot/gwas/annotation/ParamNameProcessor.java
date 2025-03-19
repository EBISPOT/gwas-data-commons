package uk.ac.ebi.spot.gwas.annotation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParamNameProcessor extends ServletModelAttributeMethodProcessor {

    @Autowired(required = false)
    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    private static final Map<Class<?>, Map<String, String>> PARAM_MAPPINGS_CACHE = new ConcurrentHashMap<>(256);

    public ParamNameProcessor() {
        super(false);
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(RequestParam.class)
                && !BeanUtils.isSimpleProperty(parameter.getParameterType())
                && Arrays.stream(parameter.getParameterType().getDeclaredFields())
                .anyMatch(field -> field.getAnnotation(GWASParamName.class) != null);
    }

    @Override
    protected void bindRequestParameters(WebDataBinder binder, NativeWebRequest nativeWebRequest) {
        Object target = binder.getTarget();
        Map<String, String> paramMappings = this.getParamMappings(target.getClass());
        ParamNameDataBinder paramNameDataBinder = new ParamNameDataBinder(target, binder.getObjectName(), paramMappings);
        requestMappingHandlerAdapter.getWebBindingInitializer().initBinder(paramNameDataBinder, nativeWebRequest);
        super.bindRequestParameters(paramNameDataBinder, nativeWebRequest);
    }

    /**
     * Get param mappings.
     * Cache param mappings in memory.
     *
     * @param targetClass
     * @return {@link Map<String, String>}
     */
    private Map<String, String> getParamMappings(Class<?> targetClass) {
        if (PARAM_MAPPINGS_CACHE.containsKey(targetClass)) {
            return PARAM_MAPPINGS_CACHE.get(targetClass);
        }
        Field[] fields = targetClass.getDeclaredFields();
        Map<String, String> paramMappings = new HashMap<>(32);
        for (Field field : fields) {
            GWASParamName GWASParamName = field.getAnnotation(GWASParamName.class);
            if (GWASParamName != null && !GWASParamName.value().isEmpty()) {
                paramMappings.put(GWASParamName.value(), field.getName());
            }
        }
        PARAM_MAPPINGS_CACHE.put(targetClass, paramMappings);
        return paramMappings;
    }

}
