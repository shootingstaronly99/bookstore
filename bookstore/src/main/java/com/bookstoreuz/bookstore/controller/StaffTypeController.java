package com.bookstoreuz.bookstore.controller;

import com.bookstoreuz.bookstore.entity.StaffType;
import com.bookstoreuz.bookstore.service.StaffTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stafftype")
@CrossOrigin(origins = "*",maxAge = 3600)
public class StaffTypeController {
    @Autowired
    StaffTypeService staffTypeService;
    @GetMapping("/")
    public ResponseEntity<Page<StaffType>>getAll(Pageable pageable){
        return ResponseEntity.ok(staffTypeService.getAll(pageable));

    }
    @PostMapping("/")
    public void save(@RequestBody  StaffType staffType) throws Exception {
        staffTypeService.add(staffType);
    }
}
