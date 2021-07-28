package com.sankdev.xml;

import jakarta.xml.bind.*;

import java.io.File;


public class XmlUtilImpl<T> implements XmlUtil<T> {

    private final Class<T> typeParameterClass;

    // the package JAXB scans to find the classes bound to xml-schemas
    private final JAXBContext jaxbContext;

    /**
     * Constructor creates an instance of {@link XmlUtilImpl} with
     * contextPath of the specified package. The package must contain
     * the parameter type {@code T} class mapped to the root element.
     *
     * @param typeParameterClass the class mapped to the root element
     *                           of an xml file.
     * @param jaxbContextPackage the context path (the package
     *                           JAXB scans to find the classes bound
     *                           to xml-schemas).
     * @throws JAXBException exception.
     */
    public XmlUtilImpl(Class<T> typeParameterClass, String jaxbContextPackage) throws JAXBException {
        this.typeParameterClass = typeParameterClass;
        this.jaxbContext = JAXBContext.newInstance(jaxbContextPackage);
    }

    @Override
    public T getRootElementValue(File xmlFile) throws JAXBException {

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        @SuppressWarnings("unchecked")
        JAXBElement<T> rootElement = (JAXBElement<T>) unmarshaller.unmarshal(xmlFile);
        
        T obj = rootElement.getValue();

        if (!obj.getClass().getName().equals(typeParameterClass.getName())) {
            throw new IllegalArgumentException("The class used is not mapped to the xml root element");
        }

        return obj;
    }

    @Override
    public File marshalToFile(T rootElementValue, File xmlFile) throws JAXBException {

        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );

        marshaller.marshal(rootElementValue, xmlFile);

        return xmlFile;
    }
}
