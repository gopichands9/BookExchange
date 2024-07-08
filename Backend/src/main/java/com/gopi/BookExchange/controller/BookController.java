package com.gopi.BookExchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gopi.BookExchange.model.Book;
import com.gopi.BookExchange.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/register")
    public ResponseEntity<Book> registerBook(@RequestBody Book book) {
        if (book.getTitle() == null || book.getAuthor() == null || book.getIsbn() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Book newBook = bookService.createBook(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }
}
