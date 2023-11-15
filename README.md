# *******Demo application to demonstrate capabilities of Spring Boot*******

* N-Tier architecture
    * REST Controllers to define API endpoints
    * Service classes that would interface with the DAO layer
    * DAO classes that interfaces with the data sources
    * An interface that extends JPARepository interface and is marked with `@Repository` to indicate that it is ready
      for
      data access and
      persistence.If a repository class extends `JpaRepository` (part of Spring Data JPA) class in Spring Boot, it means
      that the repository inherits a set of pre-defined methods for performing common data access and persistence
      operations on a database.
    * Inject the instance of the above interface within the DAO class to perform all your CRUD operations.


* Dependency Injection
    * `@Component` : Indicate that this class is an eligible bean and is added to the DI container for lifecycle
      management at the time of Spring Component Scanning
    * `@Bean` : In the configuration class(annotated with `@Configuration`) this annotation on top of a method indicates
      that the execution of the method will result in the generation of a bean that can be injected.
    * `@Autowired` : Have Spring DI container to automatically inject an instance of the said dependency. As per SOLID
      principles (Liskov substitution), the type of the dependency must be an interface and the actual implementation
      would be decided at runtime based on qualifier rules.


* JSON with Jackson Fasterxml
    * Provided Java Bean to JSON mapping using the famous ObjectMapper class


* Building APIs with Spring MVC


* Java Bean Validation
    * @Valid, @NotNull,@Email annotation to perform request body validation and hence reduce a lot of validation
      boilerplate code


* Exception Handling


* Spring Data & Databases


* OpenFeign Client
    * Used for seamless invocation of other HTTP/Websocket endpoints from the web application
    * Provides facilities like interception to play around with the request and response, plus many other features.
    * Annotate Main app class with `@EnableFeignClients`
    * Create an interface annotated with `@FeignClient` annotation and define base url
    * Abstract methods of this interface would correspond to HTTP endpoints of the target server and the return type of
      the methods must also be mapped correctly for proper Response<>Object mapping.
    * Inject and instance of this interface into any class and enjoy!


* Logging
    * Default backbone/ implementation in SpringBoot provided by Apache Commons Logging, which is alternative to log4j2
    * A static instance of Logger needs to be created for each class where logging need to be done
    * Use `@Sl4j` annotation from Lombok to avoid the verbosity that comes with step 2 and use _log_ object to do all
      your logging
    * Default logging happens to console, if file logging or extra features like log rotation is needed, need to defined
      properties accordingly


* Spring Boot Actuator and Metrics
    * Prod environment deployment would need a lot of metrics related to health of the application as well as the JVM
    * This includes the status/uptime of the app, beans created, threads spawned,heap size etc.
    * Actuator's aim to expose these metrics for downstream consumption by APM(App Perf Monitoring) tools
    * Now default actuator is not enough, we need to integrate some other metrics library that can do all that an
      actuator does
      plus support additional features like custom metrics, tagging, filtering etc.
    * Also, we might need endpoints other than HTTP and JMX, which is where Micrometer comes.Alternative to Dropwizard
      Metrics,StatsD.
    * Now Micrometer can expose info that could be used by modern APMs like Prometheus,NewRelic,etc
    * Micrometer is SLF4J for metrics and observability.


* App Configuration/Properties and Profiles:
    * By default, SpringBoot uses the application.properties as a default profile.
    * However, custom profiles can be set using: `spring.profiles.active=dev` as a program argument, useful for
      feature/test environments.


* Testing

# Running the application

* `./mvnw clean install `OR `./mvnw clean package `
* Navigate to target folder and run java -jar < jarfile > < app arguments >
* Populate the contents of data.sql into the customer DB (after connecting to H2 DB using the credentials mentioned in
  the properties file)
* Play around!!!