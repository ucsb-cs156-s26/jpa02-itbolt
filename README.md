# jpa02-itbolt

Repo: https://github.com/ucsb-cs156-s26/jpa02-itbolt

Deployed at: https://jpa02-itbolt.dokku-11.cs.ucsb.edu


# About this repo

This is a minimal "Hello World" type webapp built with Spring Boot.

# What can you do with this code?

| Command | What it does   |
|----------|---------------------------------------|
| `mvn compile` | Should result in a clean compile |
| `mvn test` | Runs JUnit tests on the code base |
| `mvn test jacoco:report` | Runs JUnit tests, and if all tests pass, computes code coverage. The code coverage report (Jacoco) can be found in `target/site/jacoco/index.html` |
| `mvn test pitest:mutationCoverage` | Runs JUnit tests, and if all tests pass, runs pit (pitest.org) mutation testing to measure effectiveness of test suite |
| `mvn package` | Builds the jar file `target/gs-spring-boot-0.1.0.jar` |
| `mvn spring-boot:run` | Runs the code to start up a web server. Access it via `http://localhost:8080` on the same machine where the server is running. Use CTRL+C to stop it. |
| `java -cp target/hello-1.0.0.jar edu.ucsb.cs156.spring.hello.Application` | If done after `mvn package`, runs the code to start up a web server. |
| `java -jar target/hello-1.0.0.jar` | If done after `mvn package`, another way to start the web server. |


# Sources

The code in this repo is in support of jpa02 for S26 for CMPSC 156.

The code in this repo is based in part on:
<https://spring.io/guides/gs/spring-boot/>

and:
<https://github.com/spring-guides/gs-spring-boot.git>

# Modifications from the original

* Java 21 support
  * Updated `pom.xml` to use Java 21
* JUnit 5
  * Converted test code to use JUnit 5
* Dokku Support
  * Configured app to use `PORT` environment variable
* Testing and CI
  * Added JUnit tests
  * Added JaCoCo for line and branch coverage
  * Added PIT for mutation testing
  * Added GitHub Actions for CI
