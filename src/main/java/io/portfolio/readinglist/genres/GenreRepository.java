package io.portfolio.readinglist.genres;

import io.portfolio.readinglist.books.Book;
import io.portfolio.readinglist.books.BookAuthorId;
import io.portfolio.readinglist.genres.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre,Long> {
    Optional<Genre> findByGenreName(String genreName);
}
