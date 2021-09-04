> 1. add @Component annotation to class file
> 2. add @Bean annotation to a method in a class with @Configuration (@SpringBootApplication has it by construct)

@Bean
public BookRepository() {
  return new BookRepository;
  }
}
