package com.HemanthReddy.Bookstore.Service;

import com.HemanthReddy.Bookstore.Model.Bookmodel;
import com.HemanthReddy.Bookstore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bookservice {

    @Autowired
    private BookRepository bookRepository;

    public Bookmodel findByBookId(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Bookmodel> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Bookmodel> getBooksByTitle(String bookName) {
        return bookRepository.findByBookName(bookName);
    }
    public void deleteBook(int id) {
         bookRepository.deleteById(id);
    }
    public void addBook(Bookmodel book) {
        bookRepository.save(book);
    }
}
