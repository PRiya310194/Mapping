package com.example.Mapping.service;

import com.example.Mapping.Repository.BookRepository;
import com.example.Mapping.model.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public Book getBookById(Integer bookId) {
        return bookRepository.findById(bookId).get();
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book updateBook(Integer bookId, Book book) {
        Book book1=bookRepository.findById(bookId).get();
        book1.setAuthor(book.getAuthor());
        book1.setTitle(book.getTitle());
        book1.setPrice(book.getPrice());
        book1.setDescription(book.getDescription());
        book1.setStudent(book.getStudent());
        return bookRepository.save(book1);
    }

    public void deleteBook(Integer bookId) {
        bookRepository.deleteById(bookId);
    }
}

