package com.bookstoreuz.bookstore.controller;

import com.bookstoreuz.bookstore.entity.Book;
import com.bookstoreuz.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/book")
@CrossOrigin(maxAge = 3600)
public class BookController {
    @Autowired
        private BookService bookService;
    @GetMapping("/")
        public ResponseEntity<Page<Book>> getAll(Pageable pageable){
            return ResponseEntity.ok(bookService.getAll(pageable));
            }
    @PostMapping("/")
         public void save(@RequestBody Book book) throws Exception { bookService.add(book);}

    @DeleteMapping("/{id}")
         public void remove(@PathVariable Long id)
                {
              bookService.deleteById(id);
                }
    @PutMapping("/{id}")
        public ResponseEntity<Object> updateAdmin(@RequestBody Book book, @PathVariable Long id) throws Exception {

          Optional<Book> AdminOptional = bookService.gertById(id);

          if (!AdminOptional.isPresent())
            return ResponseEntity.notFound().build();

            book.setId(id);
            bookService.update(book);
         return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
        public Optional<Book> getById(@PathVariable Long id){
        return bookService.gertById(id);
             }

    }