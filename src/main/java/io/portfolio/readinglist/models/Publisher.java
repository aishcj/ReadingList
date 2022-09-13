package io.portfolio.readinglist.models;

import io.portfolio.readinglist.models.Book;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long publisherId;

    @Column(name = "Publisher Name")
    private String publisherName;

 /*   @OneToMany
    @JoinColumn(name="publisherId")
    private List<Book> books = new ArrayList<>(); */

    public Publisher() {
    }

    public Publisher(long publisherId, String publisherName) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
    }

    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
