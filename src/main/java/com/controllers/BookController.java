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
    private BookRepository bookRepository;

    @RequestMapping("")
    public List<Book> getall(){
        return bookRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Book getOne(@PathVariable(value = "id") String id){
        return bookRepository.getOne(Integer.valueOf(id));
    }

    @RequestMapping("/publisher/{id}")
    public List<Book> getBookByPublisher(@PathVariable("id") String id){
        return bookRepository.findByPublishersId(Integer.valueOf(id));
    }

    @RequestMapping("{idbook}/publisher/{idpublisher}")
    public Book getBookByPublisherAndBookIds(@PathVariable("idbook") String idbook, @PathVariable("idpublisher") String idpublisher){
        return bookRepository.findByIdAndPublishersId(Integer.valueOf(idbook), Integer.valueOf(idpublisher));
    }
}
