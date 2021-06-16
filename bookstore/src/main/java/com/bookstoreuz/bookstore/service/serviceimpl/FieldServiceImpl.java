package com.bookstoreuz.bookstore.service.serviceimpl;

import com.bookstoreuz.bookstore.entity.Book;
import com.bookstoreuz.bookstore.service.FieldService;
import com.bookstoreuz.bookstore.entity.Field;
import com.bookstoreuz.bookstore.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class FieldServiceImpl implements FieldService {
    @Autowired
    FieldRepository fieldRepo;
    @Override
    public Page<Field> getAll(Pageable pageable) {
        return fieldRepo.findAll(pageable);
    }

    @Override
    public void update(Field data) { fieldRepo.save(data);

    }

    @Override
    public Field add(Field data) throws Exception {
        if(data.getId()==null)
            return fieldRepo.save(data);
        else
        throw new Exception("Yangi kiritilayotgan ma'lumotda id bo'lmasligi kerak!");
    }

    @Override
    public void delete(Field data) {
fieldRepo.delete(data);
    }

    @Override
    public Optional<Field> gertById(Long aLong) {
        return fieldRepo.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        fieldRepo.deleteById(aLong);

    }
}
