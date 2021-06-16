package com.bookstoreuz.bookstore.repository;

import com.bookstoreuz.bookstore.entity.StaffType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface StaffTypeRepository extends JpaRepository<StaffType,Long> {
    public List<StaffType> findAll();
}
