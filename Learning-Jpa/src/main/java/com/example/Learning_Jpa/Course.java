package com.example.Learning_Jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    Integer id;

    String name;

    String author;

    public Course() {
    }

    public Course(Integer id, String name, String author){
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
