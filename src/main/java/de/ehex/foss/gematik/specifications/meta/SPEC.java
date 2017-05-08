package de.ehex.foss.gematik.specifications.meta;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import de.ehex.foss.gematik.specifications.Specifications;
import de.ehex.foss.gematik.specifications.meta.SPEC.SPECS;

@Documented
@Retention(CLASS)
@Target({ TYPE, CONSTRUCTOR, METHOD, PARAMETER, FIELD })
@Repeatable(SPECS.class)
public abstract @interface SPEC {

    public abstract Specifications value();

    public abstract String note() default "";

    @Documented
    @Retention(CLASS)
    @Target({ TYPE, CONSTRUCTOR, METHOD, PARAMETER, FIELD })
    public abstract @interface SPECS {
        public abstract SPEC[] value();
    }
}
