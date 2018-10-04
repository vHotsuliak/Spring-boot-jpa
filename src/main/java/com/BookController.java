package com;


import com.model.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookRepository bookRepository;

    @RequestMapping("{id}")
    public Book getOne(@PathVariable("id") String id){
        return bookRepository.getOne(Integer.valueOf(id));
    }
    @RequestMapping("/publisher{id}")
    public List<Book> getStudentClasses(@PathVariable("id") String id){
        return bookRepository.findByPublishersId(Integer.valueOf(id));
    }
}
