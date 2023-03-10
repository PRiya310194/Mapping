package com.example.Mapping.controller;

import com.example.Mapping.model.Book;
import com.example.Mapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/book")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
    @GetMapping("book/{bookId}")
    public Book getBookById(@PathVariable Integer bookId){
        return bookService.getBookById(bookId);
    }
    @GetMapping("/book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @PutMapping("/book/{bookId}")
    public Book updateBook(@PathVariable Integer bookId,@RequestBody Book book){
        return bookService.updateBook(bookId,book);
    }
    @DeleteMapping("/book/{bookId}")
    public void deleteBook(@PathVariable Integer bookId){
        bookService.deleteBook(bookId);
    }
}

