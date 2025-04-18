package uk.ac.ebi.spot.gwas.annotation;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.web.servlet.mvc.method.annotation.ExtendedServletRequestDataBinder;

import javax.servlet.ServletRequest;
import java.util.Map;

public class ParamNameDataBinder extends ExtendedServletRequestDataBinder {

    private final Map<String, String> renameMapping;

    public ParamNameDataBinder(Object target, String objectName, Map<String, String> renameMapping) {
        super(target, objectName);
        this.renameMapping = renameMapping;
    }

    @Override
    protected void addBindValues(MutablePropertyValues mutablePropertyValues, ServletRequest request) {
        super.addBindValues(mutablePropertyValues, request);
        for (Map.Entry<String, String> entry : renameMapping.entrySet()) {
            String from = entry.getKey();
            String to = entry.getValue();
            if (mutablePropertyValues.contains(from)) {
                mutablePropertyValues.add(to, mutablePropertyValues.getPropertyValue(from).getValue());
            }
        }
    }
}


