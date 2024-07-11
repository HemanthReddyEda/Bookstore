package com.HemanthReddy.Bookstore.Controller;

import com.HemanthReddy.Bookstore.Model.Bookmodel;
import com.HemanthReddy.Bookstore.Service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class Bookcontroller {

    @Autowired
    private Bookservice bookService;

    @GetMapping
    public List<Bookmodel> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{title}")
    public List<Bookmodel> getBooksByTitle(@PathVariable String title) {
        return bookService.getBooksByTitle(title);
    }

    @GetMapping("/Id")
    public Bookmodel findByBookId(@RequestParam int Id) {
        return bookService.findByBookId(Id);
    }
    @GetMapping("/delete")
    public void deleteBook(@RequestParam int Id) {
        bookService.deleteBook(Id);
    }
    @PostMapping
    public void addBook(@RequestBody Bookmodel book) {
        bookService.addBook(book);
    }
}
