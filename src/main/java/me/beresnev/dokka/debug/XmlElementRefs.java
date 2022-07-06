package me.beresnev.dokka.debug;

import java.lang.annotation.Documented;

@Documented
public @interface XmlElementRefs {
    XmlElementRef[] value();
}
