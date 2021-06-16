package com.bookstoreuz.bookstore.service;

import com.bookstoreuz.bookstore.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService extends MainService<Book,Long> {
    List<Book> getByAuthor(Book data);
    List<Book> getByPrice(Book data);
}
