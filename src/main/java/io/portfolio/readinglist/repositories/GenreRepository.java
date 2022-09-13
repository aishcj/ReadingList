package io.portfolio.readinglist.repositories;

import io.portfolio.readinglist.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre,Long> {
    Optional<Genre> findByGenreId(long genreId);
}
