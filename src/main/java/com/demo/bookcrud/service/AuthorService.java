package com.demo.bookcrud.service;

import com.demo.bookcrud.entity.Author;

import java.util.List;

public interface AuthorService {
    void save(Author author);
    List<Author> findAll();

}
