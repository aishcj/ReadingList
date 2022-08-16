package io.portfolio.readinglist.genres;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Genre {

    @Id
    @Column(name = "Genre Name")
    private String genreName;

    @Column (name= "Books")
    private List<BookGenreId> bookGenreIds;


    public <BookGenreID> Genre(String genreName, List<BookGenreId> bookGenre) {
        this.genreName = genreName;
        this.bookGenreIds = bookGenre;
    }

    public Genre() {
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public List<BookGenreId> getBookGenreIds() {
        return bookGenreIds;
    }

    public void setBookGenreIds(List<BookGenreId> bookGenreIds) {
        this.bookGenreIds = bookGenreIds;
    }
}
