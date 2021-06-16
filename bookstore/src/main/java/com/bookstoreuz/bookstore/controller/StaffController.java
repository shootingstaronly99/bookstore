package com.bookstoreuz.bookstore.controller;

import com.bookstoreuz.bookstore.entity.Orders;
import com.bookstoreuz.bookstore.entity.Staff;
import com.bookstoreuz.bookstore.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    @Autowired
    StaffService staffService;
    @GetMapping("/")
    public ResponseEntity<Page<Staff>> getAll(Pageable pageable){
        return ResponseEntity.ok(staffService.getAll(pageable));
    }
    @PostMapping("/")
    public void save(@RequestBody Staff staff) throws Exception {
        staffService.add(staff);
    }
}
