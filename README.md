# Programming-Exercise-Java

Programming exercise for Java developer candidates.

## Producing a war file 
```bash
./gradlew clean bootWar 
```

## Running using tomcat gradle plugin
```bash
./gradlew clean bootWar tomcatRunWar
```

## Installing Tomcat 
1. Install tomcat 8 using one of these options

```bash
brew install tomcat@8 
```

OR install it manually [from the site](http://tomcat.apache.org/tomcat-8.5-doc/index.html)

## Running in an installed tomcat server
The easiest way to run this application is simply to move the war file to your CATALINA_BASE/webapps directory. A default Tomcat install will automatically expand and deploy the application for you. You can view it with the following URL (assuming that you're running tomcat on port 8080 which is the default): 
http://localhost:8080/Programming-Excercise-Java

Note: CATALINA_BASE is usually the directory in which you unpacked the Tomcat distribution. For more information on CATALINA_HOME, CATALINA_BASE and the difference between them see RUNNING.txt in the directory you unpacked your Tomcat distribution.



