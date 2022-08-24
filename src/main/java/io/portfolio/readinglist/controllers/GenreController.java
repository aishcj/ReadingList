package io.portfolio.readinglist.controllers;

import io.portfolio.readinglist.services.GenreService;
import io.portfolio.readinglist.models.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping("/genres")
    public ResponseEntity<List<Genre>> getAllGenres() {
        return ResponseEntity.ok().body(genreService.getAllGenre());
    }

    @GetMapping("/genres/{id}")
    public ResponseEntity<Genre> getGenreByID(@PathVariable long id) {
        return ResponseEntity.ok().body(genreService.getGenreByID(id));
    }

    @PostMapping("/genres")
    public ResponseEntity<Genre> createGenre(@RequestBody Genre genre) {
        return ResponseEntity.ok().body(this.genreService.createGenre(genre));
    }

    @PutMapping("/genres/{id}")
    public ResponseEntity<Genre> updateGenre(@PathVariable String name, @RequestBody Genre genre) {
        genre.setGenreName(name);
        return ResponseEntity.ok().body(this.genreService.updateGenre(genre));
    }

    @DeleteMapping("/genres/{id}")
    public HttpStatus deleteGenre(@PathVariable long id){
        this.genreService.deleteGenre(id);
        return HttpStatus.OK;
    }
    @DeleteMapping("/genres/{name}")
    public HttpStatus deleteGenre(@PathVariable String name){
        this.genreService.deleteGenreName(name);
        return HttpStatus.OK;
    }
}
