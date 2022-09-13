package io.portfolio.readinglist.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;

    @Column(name = "Title")
    private String bookTitle;


    @Column(name = "Price")
    private long price;

    @OneToOne
    @JoinColumn (name = "authorId")
    private Author author;


    @OneToOne
    @JoinColumn (name = "genreId")
    private Genre genre;

    @OneToOne
    @JoinColumn(name="publisherId")
    private Publisher publisher;

    public Book() {
    }

    public Book(long bookId, String bookTitle, long price, Author author, Genre genre, Publisher publisher) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.price = price;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
