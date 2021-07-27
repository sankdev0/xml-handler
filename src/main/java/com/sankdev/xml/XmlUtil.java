package com.sankdev.xml;


import java.io.File;

/**
 * Utility class for working with xml files using JAXB marshalling.
 * Marshalling and unmarshalling methods should use the same JAXB context
 * @param <T> - class of the root xml tag (usually generated with JAXB xjc binding compiler)
 */
public interface XmlUtil<T> {

    T getRootElementValue(File file);

    File marshalToFile(T t);

}
