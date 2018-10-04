package com.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "publishers", cascade = CascadeType.PERSIST)
    private Set<Book> books;

    public Publisher(){

    }

    public Publisher(String name){
        this.name = name;
    }

    public Publisher(String name, Set<Book> books){
        this.name = name;
        this.books = books;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}