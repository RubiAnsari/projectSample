package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.entities.Book;
@Component
public  class bookService {

    private  static List<Book> list= new ArrayList<>();

    static {
        list.add(new Book("java Complete Reference",12,"xyz"));
        list.add(new Book("head first to java",12,"abc"));
        list.add(new Book("thing in java",14,"arr"));
    }

    //get all books
    public List<Book> getAllBooks()
    {
        return list;
    }

    //get single Book by id
    public Book getBookbyIdBook(int id)
    {
        Book  book = null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
    
}
