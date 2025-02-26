package uk.ac.ebi.spot.gwas.annotation;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GWASParamName {
    /**
     * The name of the request parameter to bind to.
     */
    String value();

}

