package com.bookstoreuz.bookstore.repository;

import com.bookstoreuz.bookstore.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface StaffRepository extends JpaRepository<Staff,Long> {
public List<Staff> findAll();
}
