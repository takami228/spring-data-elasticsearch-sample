package com.example.elasticsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void delete(Book book) {
        bookRepository.delete(book);
    }

    public Book findOne(String id) {
        return bookRepository.findOne(id);
    }

    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    public Page<Book> findByAuthor(String author, PageRequest pageReqeust) {
        return bookRepository.findByAuthor(author, pageReqeust);
    }

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
}
