
**bean** -> class (object) spring is aware of.

**Spring beans repository** -> all objects spring is aware of. Created and putted in the repo.

**Beans are define by adding @Component or @Bean annotation with @Configuration (@SpringBootApplication has it)


Dependecy Injection --> helps manage dependencies betwen objects


**Autowiring feature of spring framework enables you to inject the object dependency implicitly**


Dependecy injection types -> constructor based, setter based, field based(not the best practice).


In some cases if constructor based cannot be used, setter is viable
contructor based injection is preferred -> can make dependecies final

**field based injection** - not recommended



What are endpoints -> point of contact


@Restcontroller + @RequestMapping -> class holds points of contact or endpoint


@RequestBody -> http body



Let’s take a look at the project you just created, and get familiar with what each file contains. The entry point for Spring boot application is a class file named Application. @SpringBootApplication is a convenience annotation that add all of the following.

@Configuration tags the class as a source of bean definitions for the application context.

@EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.

Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.

@ComponentScan tells Spring to look for other components, configurations, and services, allowing it to find the controllers.

The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. 

You would notice a file under resources folder called application.properties, which is a file used to change application environment. We will talk about that in later videos. You can also use command line or YAML to change the properties configuration to run the application.

