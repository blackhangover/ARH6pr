package com.example.test.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.test.model.Book;
import com.example.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookQuery implements GraphQLQueryResolver {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getBooks(){
        return null;
    }

    public Book getBook(int id){
        return bookRepository.findById(id);

    }
}
