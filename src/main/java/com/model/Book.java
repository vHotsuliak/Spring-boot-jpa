package com.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Book")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idbook")
    private int id;

    private String name;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "book_publisher",
            joinColumns = @JoinColumn(name = "idbook"),
            inverseJoinColumns = @JoinColumn(name = "idpublisher"))
    private Set<Publisher> publishers;

}
