package io.portfolio.readinglist.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookGenre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long bookId;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long genreId;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }
}
