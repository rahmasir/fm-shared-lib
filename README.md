[![](https://jitpack.io/v/rahmasir/fm-shared-lib.svg)](https://jitpack.io/#rahmasir/fm-shared-lib)

# Shared Library (fm-shared-lib)

This module is a standard Java library (JAR) that contains code shared across multiple microservices in the Freelancer Market project.

## Purpose

The primary purpose of this library is to enforce the **DRY (Don't Repeat Yourself)** principle and ensure consistency. It contains common classes that are used for communication and data representation between services.

### Contents

* **Enums**: Common enumerations like `UserRole`, `ProjectStatus`, and `ApplicationStatus`.
* **DTOs (Future)**: Data Transfer Objects that might be used for inter-service communication.
* **Custom Exceptions (Future)**: Shared exception classes if a common error-handling pattern across services is desired.

## Important Notes

* **This is NOT a runnable application.** It does not contain a `main` method or the Spring Boot plugin. It is a simple library that gets packaged as a `.jar` file.
* It is framework-agnostic and does not contain any Spring dependencies to keep it lightweight.

## Usage

Other services, like `fm-user-service` and `fm-project-service`, include this library as a standard Maven dependency in their `pom.xml` file:

```xml
<dependency>
    <groupId>org.rahmasir</groupId>
    <artifactId>fm-shared-lib</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```


## JITPACK
you can check it here: [rahmasir/fm-shared-lib](https://jitpack.io/#rahmasir/fm-shared-lib). I guess it doesn't work but you can use this with its parent `pom.xml` in **fm-hub**.

To get this Git project into your build:
1. Add the JitPack repository to your build file
   
    Add to pom.xml
    ```xml
   <repositories>
     <repository>
       <id>jitpack.io</id>
       <url>https://jitpack.io</url>
     </repository>
   </repositories>
   ```
2. Add the dependency
   ```xml
   <dependency>
     <groupId>com.github.rahmasir</groupId>
     <artifactId>fm-shared-lib</artifactId>
     <version>v1.0.0</version>
   </dependency>
   ```
