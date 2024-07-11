package com.HemanthReddy.Bookstore.Repository;

import com.HemanthReddy.Bookstore.Model.Bookmodel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Bookmodel, Integer> {
    @Override
    List<Bookmodel> findAll();

    List<Bookmodel> findByBookName(String bookName);
    Bookmodel findByBookId(Integer bookId);
    void deleteById(Integer bookId);
}
