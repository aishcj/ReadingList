package io.portfolio.readinglist.bookauthors;

import io.portfolio.readinglist.bookauthors.BookAuthorId;
import io.portfolio.readinglist.models.Genre;

import javax.persistence.*;
import java.util.List;

@Entity
public class BookGenreId {

    @EmbeddedId
    @Column(name="bookAuthorId")
    private BookAuthorId bookAuthorId;

    @OneToMany
    @JoinColumn(name = "genreName")
    private List<Genre> genre;

    public BookGenreId() {
    }

    public BookGenreId(BookAuthorId bookAuthorId, List<Genre> genre) {
        this.bookAuthorId = bookAuthorId;
        this.genre = genre;
    }

    public BookAuthorId getBookAuthorId() {
        return bookAuthorId;
    }

    public void setBookAuthorId(BookAuthorId bookAuthorId) {
        this.bookAuthorId = bookAuthorId;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = genre;
    }
}
