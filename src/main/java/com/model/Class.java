package com.model;


import lombok.Data;

import java.util.Set;

@Data
public class Class {
    private long id;

    private int year;

    private String letter;

    private String description;

    // should have type Teacher, this object not done now
    private String teacher;

    // should have type Subject, this object not done now
    private Set<String> subjects;

    // should have type Student, this object not done now
    private Set<String> students;
}
