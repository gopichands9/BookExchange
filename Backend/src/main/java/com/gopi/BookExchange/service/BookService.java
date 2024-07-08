package com.gopi.BookExchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gopi.BookExchange.model.Book;
import com.gopi.BookExchange.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        if (book.getTitle() == null || book.getAuthor() == null || book.getIsbn() == null) {
            throw new IllegalArgumentException("Title, author, and ISBN cannot be null");
        }
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
