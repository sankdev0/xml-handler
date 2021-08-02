package com.sankdev.xml;

import jakarta.xml.bind.JAXBException;

import java.io.File;
import java.io.IOException;

/**
 * Utility interface for working with xml files using JAXB marshalling (jaxb-ri). Marshalling and
 * unmarshalling methods should use the same JAXB context
 *
 * @param <T> - the class mapped to the root xml element. Usually it is a class generated with JAXB
 *            xjc binding compiler. <b>The mapped class must have {@link
 *            jakarta.xml.bind.annotation.XmlRootElement} annotation.</b>
 */
public interface XmlUtil<T> {

  /**
   * Get object representing the root element in an xml file.
   *
   * @param xmlFile the xml file to retrieve the root element from
   * @return the object representing the root xml element.
   */
  T getRootElementValue(File xmlFile) throws JAXBException, IOException;

  /**
   * Marshal the object representing the root xml element.
   *
   * @param rootElementValue the object  representing the root element to marshal to a file. It must
   *                         have {@link jakarta.xml.bind.annotation.XmlRootElement} annotation.
   * @return the updated file result of marshalling.
   */
  File marshalToFile(T rootElementValue, File xmlFile) throws JAXBException;

}
