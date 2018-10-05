package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Publisher")
@Data
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idpublisher")
    private int id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "publishers", cascade = CascadeType.PERSIST)
    private Set<Book> books;
}