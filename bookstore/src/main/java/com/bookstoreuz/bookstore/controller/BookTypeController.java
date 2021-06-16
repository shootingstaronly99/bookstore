package com.bookstoreuz.bookstore.controller;

import com.bookstoreuz.bookstore.entity.BookType;
import com.bookstoreuz.bookstore.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booktype")
public class BookTypeController {
    @Autowired
    BookTypeService bookTypeService;
    @GetMapping("/")
    public ResponseEntity<Page<BookType>> getAll(Pageable pageable){
        return ResponseEntity.ok(bookTypeService.getAll(pageable));
    }
    @PostMapping("/")
    public void save(@RequestBody BookType bookType) throws Exception {
        bookTypeService.add(bookType);
    }
}
