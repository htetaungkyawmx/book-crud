package com.demo.bookcrud.service;

import com.demo.bookcrud.entity.Book;

import java.util.List;

public interface BookService {
    void save(Book book);
    List<Book> findAll();
    Book findById(Long id);
}
