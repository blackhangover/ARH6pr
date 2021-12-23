package com.example.test.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.test.model.Book;
import com.example.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookMutation implements GraphQLMutationResolver {
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(final String name, final String genre,final String fio){
        Book book = new Book();
        book.setFio(fio);
        book.setGenre(genre);
        book.setName(name);
        return bookRepository.save(book);
    }
}
