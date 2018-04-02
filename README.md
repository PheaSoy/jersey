
# Welcome to our Jersey Project
> One of the most powerful Java framework for build Restful API is Jersey.


This of tutorails will provide you the sample code for your first start with Jersey. I am happy for getting your feedback.

##  started

You may require to know some knowledge,
- Java Programming
- Build tools(maven)
- Restful Concepts
- Client tools test(CURL,POSTMAN,etc)


## Jersey Description

- @Path: This defines the resource base URI.
- @PathParams("params"):This annotation injects the parameters into the path, contact id in this case, to the method parameter. Other available annotations are @FormParam, @QueryParam, and so on.
- @Consumes: define media type accept request such as (application/XML, application/json,etc)
- @Produces: define media type of your response to the client request such as (application/XML, application/json,etc)


## Reference 
- [Jersey API Docs](https://jersey.github.io)
- [REST API with Jersey and Spring](http://www.baeldung.com/jersey-rest-api-with-spring)
- [Restful Specs](http://www.restapitutorial.com)

# Let's start
1. Create Dynamic Web Project in Eclipse. File -> New -> Dynamic Web Project, put your project name.
2. Click on Your project -> Configure -> Convert to Maven Project.

Add your dependencies in pom file

---- 

    <properties>
        <springframework.version>4.3.0.RELEASE</springframework.version>
        <jackson.library>2.7.5</jackson.library>
    </properties>
 
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>${springframework.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${springframework.version}</version>
        </dependency>
 
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>${jackson.library}</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-xml</artifactId>
            <version>${jackson.library}</version>
        </dependency>
    </dependencies>
 
----


After adding your dependencies please click on project Maven Update.
Ceate the Tomcat Server in your IDE.
Click Run -> Your project as Server.


