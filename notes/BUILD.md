This will be a note page of building this app from scratch
# Getting Started
## Java Spring
- Track activites/locations through RESTful API
- Created in spring boot
    Java 24, Maven, Spring Boot 3.5.0
    Dependencies: Spring Web, Spring Boot Dev Tools, Postgresql driver
    package name dev.heyezra.scoop
    packaging: jar
    artifact & name: both "scoop"
    group: dev.heyezra
- Downloaded Java
    - moved download into scoop
    - tar zxvrf <file_name>
    - export JAVA_HOME=$(pwd)/jre1.8.0_441
    - export PATH=$JAVA_HOME/bin:$PATH
### Issue Summary

While running `mvn spring:run`, the process kept crashing. Upon investigation, it was found that `jek` was being called instead of `jdk`, and there was no JDK installed. After installing the JDK, another issue arose: the Java version in `pom.xml` was set to **24**, but the installed JDK was **17**. This caused a version mismatch error.

#### Solution

1. Installed the **JDK** since it was missing.
2. Updated the Java version in `pom.xml` from **24** to **17** to match the installed JDK.
3. Re-ran the build process to ensure compatibility.

Now, `mvn spring:run` should work without errors.