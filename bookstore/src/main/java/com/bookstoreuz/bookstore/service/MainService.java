package com.bookstoreuz.bookstore.service;

import com.bookstoreuz.bookstore.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface MainService<T,ID> {
    public Page<T> getAll(Pageable pageable);
    public  void update(T data) throws Exception;
    public T add(T data) throws Exception;
    public void delete(T data);
    Optional<T> gertById(ID id);
    void deleteById(ID id);
}
