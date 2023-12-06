package com.demo.bookcrud.controller;

import com.demo.bookcrud.entity.Book;
import com.demo.bookcrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    //1st phrase
    @GetMapping("/book/add")
    public String showForm(Model model) {
        Book book = new Book();
        model.addAttribute("newBook", book);
        return "books/addBook";
    }

    //2nd phrase
    @PostMapping("/book/add")
    public String getBook(Book book, Model model) {

        bookService.save(book);
        model.addAttribute("newBook", book);
        return "books/addBook";

    }
}
