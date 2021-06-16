package com.bookstoreuz.bookstore.repository;

import com.bookstoreuz.bookstore.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FieldRepository extends JpaRepository<Field,Long> {
    public List<Field>findAll();
}
