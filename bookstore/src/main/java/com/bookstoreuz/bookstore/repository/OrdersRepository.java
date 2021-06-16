package com.bookstoreuz.bookstore.repository;

import com.bookstoreuz.bookstore.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface OrdersRepository extends JpaRepository<Orders,Long> {
    public List<Orders> findAll();
}
