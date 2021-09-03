package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryService {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookRepository bookrepo;

    public LibraryService() {
    }
}
