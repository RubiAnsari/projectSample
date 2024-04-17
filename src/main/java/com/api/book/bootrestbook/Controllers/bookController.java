package com.api.book.bootrestbook.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.entities.Book;

@RestController
public class bookController {

@Autowired
    private BookService  bookService;
@ GetMapping ("/books")
  
    public List <Book>getBooks()
    {
     return this.bookService.getAllBooks(); 


    }
    public Book getBook(@PathVariable("id") int id)
    {
return bookService.getBookById(id);
    }
}
    
