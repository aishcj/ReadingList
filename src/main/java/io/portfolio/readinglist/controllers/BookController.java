package io.portfolio.readinglist.controllers;

import io.portfolio.readinglist.models.Book;
import io.portfolio.readinglist.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok().body(bookService.getAllBooks());
    }

    @GetMapping("/books")
    public ResponseEntity<Book> getBookByID(@PathVariable long id) {
        return ResponseEntity.ok().body(bookService.getBookByID(id));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok().body(this.bookService.createBook(book));
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable long id, @RequestBody Book book) {
        book.setBookId(id);
       return ResponseEntity.ok().body(this.bookService.updateBook(book));
    }

    @DeleteMapping{"/books/{id}"}
    public HttpStatus deleteBook(@PathVariable long id){
        this.bookService.deleteBook(id);
        return HttpStatus.OK;
    }

}

