package com.bookstoreuz.bookstore.service.serviceimpl;
import com.bookstoreuz.bookstore.entity.Book;
import com.bookstoreuz.bookstore.entity.StaffType;
import com.bookstoreuz.bookstore.repository.StaffTypeRepository;
import com.bookstoreuz.bookstore.service.StaffTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StaffTypeServiceImpl implements StaffTypeService {
    @Autowired
    StaffTypeRepository staffTypeRepository;
    @Override
    public Page<StaffType> getAll(Pageable pageable) {
        return staffTypeRepository.findAll(pageable);
    }

    @Override
    public void update(StaffType data) {
staffTypeRepository.save(data);
    }

    @Override
    public StaffType add(StaffType data) throws Exception {
        if (data.getId()==null)
    return staffTypeRepository.save(data);
        else
            throw new Exception("Yangi kiritilayotgan ma'lumotda id bo'lmasligi kerak!");
    }

    @Override
    public void delete(StaffType data) {
    staffTypeRepository.delete(data);
    }

    @Override
    public Optional<StaffType> gertById(Long aLong) {
        return staffTypeRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        staffTypeRepository.deleteById(aLong);
    }
}
