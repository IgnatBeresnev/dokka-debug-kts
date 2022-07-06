package me.beresnev.dokka.debug;


import java.lang.annotation.Documented;

@Documented
public @interface XmlElementRef {
    String name();

    String namespace();

    boolean required();

    Class<JAXBElement> type();
}
