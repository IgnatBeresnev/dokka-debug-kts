package me.beresnev.dokka.debug;

import java.util.List;

public class FirstAnnotations {

    @XmlElementRefs({
            @XmlElementRef(name = "NotOffered", namespace = "http://www.gaeb.de/GAEB_DA_XML/DA86/3.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<Object>> content;
}
