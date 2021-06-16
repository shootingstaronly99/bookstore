package com.bookstoreuz.bookstore.controller;

import com.bookstoreuz.bookstore.entity.Field;
import com.bookstoreuz.bookstore.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/field")
@CrossOrigin(maxAge = 3600)
public class FieldController {
    @Autowired
    FieldService fieldService;
    @GetMapping("/")
    public Page<Field> getAllField(Pageable pageable){
        return fieldService.getAll(pageable);
    }
    @PostMapping("/")
    public void save(@RequestBody Field field) throws Exception {
        fieldService.add(field);
    }
}
