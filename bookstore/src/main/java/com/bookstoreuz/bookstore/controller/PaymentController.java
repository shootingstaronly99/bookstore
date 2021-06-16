package com.bookstoreuz.bookstore.controller;

import com.bookstoreuz.bookstore.entity.Orders;
import com.bookstoreuz.bookstore.entity.Payment;
import com.bookstoreuz.bookstore.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @GetMapping("/")
    public ResponseEntity<Page<Payment>> getAll(Pageable pageable){
        return ResponseEntity.ok(paymentService.getAll(pageable));
    }
    @PostMapping("/")
    public void save(@RequestBody Payment  payment) throws Exception {
        paymentService.add(payment);
    }
}
