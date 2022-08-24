package io.portfolio.readinglist.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long genreId;

    @Column(name = "Genre Name")
    private String genreName;

    public Genre() {
    }

    public Genre(long genreId, String genreName) {
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
