package me.beresnev.dokka.debug;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SimpleAnnotation {
    Class<?> clazz();
}
