xml-handler is a simple Java application that uses JAXB (jaxb-ri v 3.0.1)
to bind XML files, unmarshal from XML file to Java code, modify and marshal
back to XML.

Development process:

1. Prepare XML schema files. Examples are put in ./src/main/resources/xml-schema.

2. Download a standalone ZIP distribution of com.sun.xml.bind:jaxb-ri:3.0.1 from
Maven Central. It contains command line tool xjc (XML to Java binding compiler).

3. Generate Java classes from XML schema files (XSD). Example of a command
(on Windows CMD):
"C:\progs\jaxb-ri\bin>xjc.bat -xmlschema -d C:\repos\xml-handler\src\main\java -p com.sankdev.edbind C:\repos\xml-handler-files\xml-schema"
where -d is the target dir for generated class files,
-p is the target package for generated class files,
the argument is the dir containing the XML schemas.

4. Develop the client program that unmarshal, modify and marshal data to XML files.