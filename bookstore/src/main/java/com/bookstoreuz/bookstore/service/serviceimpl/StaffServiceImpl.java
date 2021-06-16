package com.bookstoreuz.bookstore.service.serviceimpl;

import com.bookstoreuz.bookstore.entity.Book;
import com.bookstoreuz.bookstore.entity.Staff;
import com.bookstoreuz.bookstore.repository.StaffRepository;
import com.bookstoreuz.bookstore.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffRepository staffRepo;
    @Override
    public Page<Staff> getAll(Pageable pageable) {
        return staffRepo.findAll(pageable);
    }

    @Override
    public void update(Staff data) throws Exception {
        staffRepo.save(data);

    }

    @Override
    public Staff add(Staff data) throws Exception {
        if(data.getId()==null)
            return staffRepo.save(data);
        else
            throw new Exception("Yangi kiritilayotgan ma'lumotda id bo'lmasligi kerak!");
    }

    @Override
    public void delete(Staff data) {
        staffRepo.delete(data);
    }

    @Override
    public Optional<Staff> gertById(Long aLong) {
        return staffRepo.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        staffRepo.deleteById(aLong);
    }
}
