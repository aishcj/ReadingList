package io.portfolio.readinglist.services;

import io.portfolio.readinglist.models.Genre;

import java.util.List;

public interface GenreService {
    Genre createGenre(Genre genre);
    Genre updateGenre(Genre genreId);
    List<Genre> getAllGenre();
    Genre getGenreByID(long genreId);
    void deleteGenre(long genreId);

}
