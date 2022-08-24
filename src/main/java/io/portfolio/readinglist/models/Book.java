package io.portfolio.readinglist.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;

    @OneToOne
    @JoinColumn (name = "authorId")
    private Author author;

    @Column(name = "Title")
    private String bookTitle;

    @Column(name = "Publisher ID")
    private long publisherId;

    @Column(name = "Price")
    private long price;


    @OneToMany
    @Column (name= "Genre ID")
    private List <Genre> genreId;

    @OneToOne
    @JoinColumn(name="publisherId")
    private Publisher publisher;

    public Book() {
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public List<Genre> getGenreId() {
        return genreId;
    }

    public void setGenreId(List<Genre> genreId) {
        this.genreId = genreId;
    }
}
