package com.example.test.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "bibl")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @OneToMany(mappedBy = "library",fetch = FetchType.EAGER,cascade = {
            CascadeType.REMOVE
    },orphanRemoval = true)
    private List<Book> bookList;
}
