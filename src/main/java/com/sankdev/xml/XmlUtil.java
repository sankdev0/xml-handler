package com.sankdev.xml;


import com.sankdev.gisgmp.GisGmpError;

import java.io.File;

/**
 * Utility class for working with xml files using JAXB marshalling (jaxb-ri).
 * Marshalling and unmarshalling methods should use the same JAXB context
 * @param <T> - class of the root xml tag (usually generated with JAXB xjc binding compiler)
 */
public interface XmlUtil<T> {

    /**
     * Get object representing the root element in an xml file
     * @param xmlFile the xml file to retrieve the root element from
     * @return the object representing the root element in an xml file
     */
    T getRootElementValue(File xmlFile);

    /**
     * Marshal the object representing the root element
     * @param rootElement object to marshal to a file
     * @return the file resulting from marshalling
     */
    File marshalToFile(T rootElement);

}
