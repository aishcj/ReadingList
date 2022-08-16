package io.portfolio.readinglist.genres;

import io.portfolio.readinglist.exceptions.ResourceNotFoundException;
import io.portfolio.readinglist.genres.Genre;
import io.portfolio.readinglist.genres.GenreRepository;
import io.portfolio.readinglist.genres.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GenreServiceImpl implements GenreService {
    @Autowired
    private GenreRepository genreRepository;

    @Override
    public Genre createGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public Genre updateGenre(Genre genre) {
        Optional<Genre> genreDB = this.genreRepository.findByGenreName(genre.getGenreName());

        if(genreDB.isPresent()){
            Genre genreUpdate = genreDB.get();
            genreUpdate.setGenreName(genre.getGenreName());
            genreRepository.save(genreUpdate);
            return genreUpdate;
        }
        else {
            throw new ResourceNotFoundException("Record with the genre ID:" + genre.getGenreName() + " not found!");
        }

    }

    @Override
    public List<Genre> getAllGenre() {
        return this.genreRepository.findAll();
    }

    @Override
    public Genre getGenreByID(long genreId) {
        Optional<Genre> genreDB = this.genreRepository.findById(genreId);

        if(genreDB.isPresent()){
            return genreDB.get();
        }
        else {
            throw new ResourceNotFoundException("Record with the genre ID:" + genreId + " not found!");
        }
    }

    @Override
    public void deleteGenre(long genreId) {
        Optional<Genre> genreDB = this.genreRepository.findById(genreId);

        if(genreDB.isPresent()){
            genreRepository.delete(genreDB.get());
        }
        else {
            throw new ResourceNotFoundException("Record with the genre ID:" + genreId + " not found!");
        }

    }
}
