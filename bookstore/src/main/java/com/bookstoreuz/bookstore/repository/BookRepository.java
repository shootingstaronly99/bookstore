package com.bookstoreuz.bookstore.repository;

import com.bookstoreuz.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    /*@Query("SELECT *  FROM book as b WHERE b.name==?")
    public List<Book>getByName();*/
}
