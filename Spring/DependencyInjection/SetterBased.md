package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryService {
    private BookService bookService;
    private BookRepository bookrepo;

    public LibraryService() {
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
        System.out.println("bookService dependency injected by spring");
    }
    @Autowired
    public void setBookrepo(BookRepository bookrepo) {
        this.bookrepo = bookrepo;
        System.out.println("BookRepository dependency injected by spring");
    }
}
