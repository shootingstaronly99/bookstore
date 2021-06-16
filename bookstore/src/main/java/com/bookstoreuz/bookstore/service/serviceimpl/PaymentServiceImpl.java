package com.bookstoreuz.bookstore.service.serviceimpl;

import com.bookstoreuz.bookstore.entity.Book;
import com.bookstoreuz.bookstore.entity.Payment;
import com.bookstoreuz.bookstore.repository.PaymentRepository;
import com.bookstoreuz.bookstore.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepository paymentRepo;
    @Override
    public Page<Payment> getAll(Pageable pageable) {
        return paymentRepo.findAll(pageable);
    }

    @Override
    public void update(Payment data) {
        paymentRepo.save(data);
    }

    @Override
    public Payment add(Payment data) throws Exception {

        if(data.getId()==null)
            return paymentRepo.save(data);
        else
        throw new Exception("Yangi kiritilayotgan ma'lumotda id bo'lmasligi kerak!");
    }

    @Override
    public void delete(Payment data) {
        paymentRepo.delete(data);
    }

    @Override
    public Optional<Payment> gertById(Long aLong) {
        return paymentRepo.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
paymentRepo.deleteById(aLong);
    }
}
