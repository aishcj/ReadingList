package io.portfolio.readinglist.controllers;

import io.portfolio.readinglist.services.AuthorService;
import io.portfolio.readinglist.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getAllAuthors() {
        return ResponseEntity.ok().body(authorService.getAllAuthors());
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<Author> getAuthorByID(@PathVariable long id) {
        return ResponseEntity.ok().body(authorService.getAuthorByID(id));
    }

    @PostMapping("/authors")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        return ResponseEntity.ok().body(this.authorService.createAuthor(author));
    }

    @PutMapping("/authors/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable long id, @RequestBody Author author) {
        author.setAuthorId(id);
        return ResponseEntity.ok().body(this.authorService.updateAuthor(author));
    }

    @DeleteMapping("/authors/{id}")
    public HttpStatus deleteAuthor(@PathVariable long id){
        this.authorService.deleteAuthor(id);
        return HttpStatus.OK;
    }
}
