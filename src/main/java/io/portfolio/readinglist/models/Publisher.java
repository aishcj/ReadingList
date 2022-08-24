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

    @OneToMany
    @JoinColumn(name="publisherId")
    private List<Book> books = new ArrayList<>();

    public Publisher(long publisherId, String publisherName, List<Book> books) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.books = books;
    }
    public Publisher() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
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
