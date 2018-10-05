package com.controllers;

import com.model.Publisher;
import com.repositorys.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/publisher")
public class PublisherController {
    @Autowired
    PublisherRepository publisherRepository;

    @RequestMapping("")
    public List<Publisher> getall(){
        return publisherRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Publisher getOne(@PathVariable(value = "id") String id){
        return publisherRepository.getOne(Integer.valueOf(id));
    }

    @RequestMapping("/book{id}")
    public List<Publisher> getBookPublisher(@PathVariable("id") String id){
        return publisherRepository.findByBooksId(Integer.valueOf(id));
    }
}
