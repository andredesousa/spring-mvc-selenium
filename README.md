# Testing a Spring MVC application with Selenium 4

E2E testing plays an important role in the application development cycle by verifying the end-to-end behavior of a system.
This project template uses [JUnit 5](https://junit.org/junit5/), [Testcontainers](https://www.testcontainers.org/) and [Selenium 4](https://www.selenium.dev/) to test a Spring MVC application with a [PostgreSQL](https://www.postgresql.org/) database.

## Overview

This project demonstrates how to test any Spring MVC application with `Selenium` and running a database server using `Testcontainers`.

[Model–view–controller](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller) (MVC) is a software design pattern commonly used for developing user interfaces that divide the related program logic into three interconnected elements:

- The **Model** encapsulates the application data and in general they will consist of POJO.
- The **View** is responsible for rendering the model data and in general it generates HTML output that the client's browser can interpret.
- The **Controller** is responsible for processing user requests and building an appropriate model and passes it to the view for rendering.

[Spring](https://spring.io/) implements MVC with the front controller pattern using its DispatcherServlet.
[Thymeleaf](https://www.thymeleaf.org/) offers a set of Spring integrations that allow you to use it as a fully-featured substitute for JSP in Spring MVC applications.

In local development, you need to provide a connection to a `PostgreSQL` instance.
You can use the following docker command:

```bash
docker run -d -p 5432:5432 -e POSTGRES_DB=spring -e POSTGRES_USER=root -e POSTGRES_PASSWORD=secret postgres
```

Spring Boot provides a convenient way to start up an application context to be used in a test.
The `@SpringBootTest` and `@Testcontainers` annotations can help you to start your application with a database.
Other than that, the `@DataJpaTest` meta-annotation contains the `@Transactional` annotation.
This ensures our test execution is wrapped with a transaction that gets rolled back after the test.

## Project structure

This project was generated with [Spring Initializr](https://start.spring.io/).
All of the app's code goes in a folder named `src/main`.
The **unit tests** and **e2e tests** are in the `src/test` and `src/e2eTest` folders.
Static files are placed in `src/main/resources` folder.

## Available gradle tasks

The tasks in [build.gradle](build.gradle) file were built with simplicity in mind to automate as much repetitive tasks as possible and help developers focus on what really matters.

The next tasks should be executed in a console inside the root directory:

- `./gradlew tasks` - Displays the tasks runnable from root project 'app'.
- `./gradlew bootRun` - Runs this project as a Spring Boot application.
- `./gradlew check` - Runs all checks.
- `./gradlew test` - Runs the unit tests.
- `./gradlew e2e` - Runs the end-to-end tests.
- `./gradlew clean` - Deletes the build directory.
- `./gradlew build` - Assembles and tests this project.
- `./gradlew help` - Displays a help message.

For more details, read the [Command-Line Interface](https://docs.gradle.org/current/userguide/command_line_interface.html) documentation in the [Gradle User Manual](https://docs.gradle.org/current/userguide/userguide.html).

## Running unit tests

Unit tests are responsible for testing of individual methods or classes by supplying input and making sure the output is as expected.

Use `./gradlew test` to execute the unit tests via [JUnit 5](https://junit.org/junit5/), [Mockito](https://site.mockito.org/) and [AssertJ](https://assertj.github.io/doc/).
Use `./gradlew test -t` to keep executing unit tests in real time while watching for file changes in the background.
You can see the HTML report opening the [index.html](build/reports/tests/test/index.html) file in your web browser.

It's a common requirement to run subsets of a test suite, such as when you're fixing a bug or developing a new test case.
Gradle provides different mechanisms.
For example, the following command lines run either all or exactly one of the tests in the `SomeTestClass` test case:

```bash
./gradlew test --tests SomeTestClass
```

For more details, you can see the [Test filtering](https://docs.gradle.org/current/userguide/java_testing.html#test_filtering) section of the Gradle documentation.

This project uses [JaCoCo](https://www.eclemma.org/jacoco/) which provides code coverage metrics for Java.
The minimum code coverage is set to 80%.
You can see the HTML coverage report opening the [index.html](build/reports/jacoco/test/html/index.html) file in your web browser.

## Running e2e tests

E2E tests determine if independently developed units of software work correctly when they are connected to each other.

Use `./gradlew e2e` to execute the e2e tests via [JUnit 5](https://junit.org/junit5/), [Testcontainers](https://www.testcontainers.org/), [Selenium 4](https://www.selenium.dev/) and [AssertJ](https://assertj.github.io/doc/).
Use `./gradlew e2e -t` to keep executing your tests while watching for file changes in the background.
You can see the HTML report opening the [index.html](build/reports/tests/e2e/index.html) file in your web browser.

Like unit tests, you can also run subsets of a test suite.
See the [Test filtering](https://docs.gradle.org/current/userguide/java_testing.html#test_filtering) section of the Gradle documentation.

## Debugging

You can debug the source code, add breakpoints, inspect variables and view the application's call stack.
Also, you can use the IDE for debugging the source code, unit and e2e tests.
You can customize the [log verbosity](https://docs.gradle.org/current/userguide/logging.html#logging) of gradle tasks using the `-i` or `--info` flag.

## Reference documentation

For further reference, please consider the following articles:

- [Official Gradle documentation](https://docs.gradle.org)
- [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/gradle-plugin/reference/html/)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-developing-web-applications)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
- [Testing with Spring Boot and @SpringBootTest](https://reflectoring.io/spring-boot-test/)
- [Testcontainers Postgres Module Reference Guide](https://www.testcontainers.org/modules/databases/postgres/)
- [Guide to Selenium with JUnit](https://www.baeldung.com/java-selenium-with-junit-and-testng)
