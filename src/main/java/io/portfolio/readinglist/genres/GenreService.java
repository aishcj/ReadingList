package io.portfolio.readinglist.genres;

import io.portfolio.readinglist.genres.Genre;

import java.util.List;

public interface GenreService {
    Genre createGenre(Genre genreId);
    Genre updateGenre(Genre genreId);
    List<Genre> getAllGenre();
    Genre getGenreByID(long genreId);
    void deleteGenre(long genreId);
}
