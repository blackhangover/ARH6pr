package com.example.test.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String genre;

    private String fio;
    @ManyToOne()
    @JoinColumn(name = "external_key")
    private Library library;
}
