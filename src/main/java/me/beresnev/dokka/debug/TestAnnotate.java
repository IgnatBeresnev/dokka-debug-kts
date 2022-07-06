package me.beresnev.dokka.debug;

import java.lang.annotation.Documented;

@Documented
public @interface TestAnnotate {

    Class<?> value();
}
