package com.bookstoreuz.bookstore.service.serviceimpl;

import com.bookstoreuz.bookstore.entity.Book;
import com.bookstoreuz.bookstore.entity.Orders;
import com.bookstoreuz.bookstore.repository.OrdersRepository;
import com.bookstoreuz.bookstore.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class OrdersServiceImpl implements OrdersService{
    @Autowired
    OrdersRepository orderRepo;
    @Override
    public Page<Orders> getAll(Pageable pageable) {
        return orderRepo.findAll(pageable);
    }

    @Override
    public void update(Orders data) {
        orderRepo.save(data);
    }

    @Override
    public Orders add(Orders data) throws Exception {

        if(data.getId()==null)
            return orderRepo.save(data);
        else
        throw new Exception("Yangi kiritilayotgan ma'lumotda id bo'lmasligi kerak!");
    }

    @Override
    public void delete(Orders data) {
        orderRepo.delete(data);

    }

    @Override
    public Optional<Orders> gertById(Long aLong) {
        return orderRepo.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
orderRepo.deleteById(aLong);
    }
}
