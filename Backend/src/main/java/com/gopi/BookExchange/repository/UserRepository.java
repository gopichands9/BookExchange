package com.gopi.BookExchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gopi.BookExchange.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
