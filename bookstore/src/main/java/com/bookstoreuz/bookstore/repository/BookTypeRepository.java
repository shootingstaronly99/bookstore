package com.bookstoreuz.bookstore.repository;

import com.bookstoreuz.bookstore.entity.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface BookTypeRepository extends JpaRepository<BookType,Long> {
    public List<BookType>findAll();
}
