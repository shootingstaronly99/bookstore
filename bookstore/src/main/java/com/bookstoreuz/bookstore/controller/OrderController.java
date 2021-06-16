package com.bookstoreuz.bookstore.controller;

import com.bookstoreuz.bookstore.entity.Orders;
import com.bookstoreuz.bookstore.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*",maxAge = 3600)
public class OrderController {
    @Autowired
    OrdersService ordersService;
    @GetMapping("/")
    public ResponseEntity<Page<Orders>> getAll(Pageable pageable){
        return ResponseEntity.ok(ordersService.getAll(pageable));
    }
    @PostMapping("/")
    public void save(@RequestBody Orders orders) throws Exception {
        ordersService.add(orders);
    }
}
