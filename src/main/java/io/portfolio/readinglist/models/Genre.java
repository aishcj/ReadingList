package io.portfolio.readinglist.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Genre {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column (name="Genre ID")
    private long genreId;

    @Column(name = "genreName")
    private String genreName;

    public Genre() {
    }

    public Genre(long genreId, String genreName, Book book) {
        this.genreId = genreId;
        this.genreName = genreName;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }


}
