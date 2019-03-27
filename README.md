# Java Programming Exercise

Programming exercise for Java developer candidates.

## Producing a war file 

```bash
./gradlew clean bootWar 
```

## Running using Tomcat Gradle plugin

```bash
./gradlew clean bootWar tomcatRunWar
```

Once the Tomcat instance is running, go to http://localhost:8080/Programming-Exercise-Java in your browser.
