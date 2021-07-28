xml-handler is a simple Java application that uses JAXB (jaxb-ri v 3.0.1)
to bind XML files, unmarshal from XML file to Java code, modify and marshal
back to XML.

Development process:

1. Prepare XML schema files. Examples are put in ./src/main/resources/xml-schema.

2. Download a standalone ZIP distribution of com.sun.xml.bind:jaxb-ri:3.0.1 from
Maven Central. It contains command line tool xjc (XML to Java binding compiler).

3. Generate Java classes from XML schema files (XSD). Example of a command
(on Windows CMD):
"C:\progs\jaxb-ri\bin>xjc.bat -xmlschema -encoding utf-8 -d C:\repos\xml-handler\src\main\java -p com.sankdev.edbind C:\repos\xml-handler-files\xml-schema"
where -d is the target dir for generated class files,
-p is the target package for generated class files,
the argument is the dir containing the XML schemas.

4. See the ModifyMarshalDemo.java demo-program that shows how to unmarshal and marshal xml-files.

5. Develop the client program that unmarshal, modify and marshal data to XML files.

Key principles and rules used in this project:
1. Execution sections are kept small for readability and maintainability.
Functionality is split into modules.
2. Programming to Interfaces in order to make Dependency Injection and
Inversion of Control possible.

Help needed on issues:
1. Introduce test coverage.
2. Move hardcoded properties to external config files.
3. Introduce automated build (including xml-java mapped classes generation).
4. Modularize the application.
5. Improve the API for code reuse as a library.