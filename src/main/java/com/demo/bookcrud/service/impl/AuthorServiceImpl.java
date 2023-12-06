package com.demo.bookcrud.service.impl;

import com.demo.bookcrud.entity.Author;
import com.demo.bookcrud.repo.AuthorRepository;
import com.demo.bookcrud.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
