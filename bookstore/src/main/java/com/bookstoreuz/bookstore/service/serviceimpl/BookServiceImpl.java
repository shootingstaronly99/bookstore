package com.bookstoreuz.bookstore.service.serviceimpl;


import com.bookstoreuz.bookstore.entity.Book;
import com.bookstoreuz.bookstore.repository.BookRepository;
import com.bookstoreuz.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> getByAuthor(Book data) {
        return null;
    }

    @Override
    public List<Book> getByPrice(Book data) {
        return null;
    }

    @Override
    public Page<Book> getAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public void update(Book data) {
         bookRepository.save(data);
    }

    @Override
    public Book add(Book data) throws Exception {  return  bookRepository.save(data);
/*
        if(data.getId()==null)

        else
        throw new Exception("Yangi kiritilayotgan ma'lumotda id bo'lmasligi kerak!");*/
    }

    @Override
    public void delete(Book data) {
bookRepository.delete(data);
    }

    @Override
    public Optional<Book> gertById(Long aLong) {
        return bookRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
    }
}
