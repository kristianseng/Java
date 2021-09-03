package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryService {
    private final BookService bookService;
    private final BookRepository bookrepo;

    @Autowired
    public LibraryService(final BookService bookService, final BookRepository bookrepo) {
        this.bookService = bookService;
        this.bookrepo = bookrepo;
    }
}
