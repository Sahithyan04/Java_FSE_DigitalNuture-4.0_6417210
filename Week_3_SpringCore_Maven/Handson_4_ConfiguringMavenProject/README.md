#  Creating & Configuring Maven Project for Spring DI

This project begins with setting up a new Maven project `library-management` using the `maven-archetype-quickstart`. The goal is to lay the foundation for a Spring-based Library Management System using Java 1.8.

##  Project Generation
Created using:
```
mvn archetype:generate -DgroupId=com.kutty -DartifactId=library-management -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

##  Dependencies Added
Added Spring dependencies to `pom.xml`:
- `spring-context` (v5.3.36) for core DI
- `spring-aop` (v5.3.36) for aspect handling
- `spring-webmvc` (v5.3.36) for web support

##  Java Compiler Setup
Configured Maven Compiler Plugin to use Java 1.8:
```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.13.0</version>
      <configuration>
        <source>1.8</source>
        <target>1.8</target>
      </configuration>
    </plugin>
  </plugins>
</build>
```

##  Installed Dependencies
Maven automatically pulled all required dependencies including `plexus-utils`, `qdox`, `asm`, and others, ensuring the project is ready for Spring development.
