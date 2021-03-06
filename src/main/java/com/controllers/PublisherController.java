package com.controllers;

import com.model.Book;
import com.model.Publisher;
import com.repositorys.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/publisher")
public class PublisherController {
    @Autowired
    private PublisherRepository publisherRepository;

    @GetMapping("")
    public List<Publisher> getall(){
        return publisherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Publisher getOne(@PathVariable(value = "id") String id){
        return publisherRepository.getOne(Integer.valueOf(id));
    }

    @GetMapping("/book/{id}")
    public List<Publisher> getBookPublisher(@PathVariable("id") String id){
        return publisherRepository.findByBooksId(Integer.valueOf(id));
    }

    @GetMapping("{idpublisher}/book/{idbook}")
    public Publisher getBookByPublisherAndBookIds(@PathVariable("idpublisher") String idpublisher, @PathVariable("idbook") String idbook){
        return publisherRepository.findByIdAndBooksId(Integer.valueOf(idpublisher), Integer.valueOf(idbook));
    }
}
