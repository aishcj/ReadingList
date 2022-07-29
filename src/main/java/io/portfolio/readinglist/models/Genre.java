package io.portfolio.readinglist.models;

import javax.persistence.*;

@Entity
public class Genre {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long genreId;

    @Column(name = "Genre Name")
    private String genreName;

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
