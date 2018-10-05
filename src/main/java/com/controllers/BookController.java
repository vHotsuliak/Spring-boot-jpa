package com.controllers;

import com.repositorys.BookRepository;
import com.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping("")
    public List<Book> getall(){
        return bookRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Book getOne(@PathVariable(value = "id") String id){
        return bookRepository.getOne(Integer.valueOf(id));
    }

    @RequestMapping("/publisher{id}")
    public List<Book> getBookPublisher(@PathVariable("id") String id){
        return bookRepository.findByPublishersId(Integer.valueOf(id));
    }
}
