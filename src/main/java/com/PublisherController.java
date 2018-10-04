package com;

import com.model.Publisher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    private PublisherRepository publisherRepository;

    @RequestMapping("{id}")
    public Publisher getOne(@PathVariable("id") String id){
        return publisherRepository.getOne(Integer.valueOf(id));
    }
    @RequestMapping("/book{id}")
    public List<Publisher> getStudentClasses(@PathVariable("id") String id){
        return publisherRepository.findByBooksId(Integer.valueOf(id));
    }
}
