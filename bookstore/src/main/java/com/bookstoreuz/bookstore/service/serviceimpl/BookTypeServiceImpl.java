package com.bookstoreuz.bookstore.service.serviceimpl;

import com.bookstoreuz.bookstore.entity.Book;
import com.bookstoreuz.bookstore.entity.BookType;
import com.bookstoreuz.bookstore.repository.BookTypeRepository;
import com.bookstoreuz.bookstore.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookTypeServiceImpl implements BookTypeService {
    @Autowired
    BookTypeRepository bookTypeRepo;
    @Override
    public Page<BookType> getAll(Pageable pageable) {
        return bookTypeRepo.findAll(pageable);
    }

    @Override
    public void update(BookType data) {
bookTypeRepo.save(data);
    }

    @Override
    public BookType add(BookType data) throws Exception {

        if(data.getId()==null)
            return bookTypeRepo.save(data);
        else
        throw new Exception("Yangi kiritilayotgan ma'lumotda id bo'lmasligi kerak!");
    }

    @Override
    public void delete(BookType data) {
        bookTypeRepo.delete(data);

    }

    @Override
    public Optional<BookType> gertById(Long aLong) {
        return bookTypeRepo.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
bookTypeRepo.deleteById(aLong);
    }
}
