Let’s take a look at the project you just created, and get familiar with what each file contains. The entry point for Spring boot application is a class file named Application. @SpringBootApplication is a convenience annotation that add all of the following.

@Configuration tags the class as a source of bean definitions for the application context.

@EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.

Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.

@ComponentScan tells Spring to look for other components, configurations, and services in the hello package, allowing it to find the controllers.

The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. Did you notice that there wasn’t a single line of XML? No web.xml file either. This web application is 100% pure Java and you didn’t have to deal with configuring any plumbing or infrastructure.

You would notice a file under resources folder called application.properties, which is a file used to change application environment. We will talk about that in later videos. You can also use command line or YAML to change the properties configuration to run the application.

If you open the pom file, you will see two dependencies have already been added. We will use lots of this file later. Luckily, with IntelliJ, when we add a dependency in our java class, it will automatically be added in this file.
