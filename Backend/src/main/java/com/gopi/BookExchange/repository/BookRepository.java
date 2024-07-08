package com.gopi.BookExchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gopi.BookExchange.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
