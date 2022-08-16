package io.portfolio.readinglist.books;

import io.portfolio.readinglist.genres.BookGenreId;
import io.portfolio.readinglist.genres.Genre;
import io.portfolio.readinglist.publishers.Publisher;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="Books")
public class Book {

    @EmbeddedId
    private BookAuthorId bookAuthorId;

    public Book(BookAuthorId bookAuthorId) {
        this.bookAuthorId = bookAuthorId;
    }

    @Column(name = "Title")
    private String bookTitle;

    @JoinColumn(name = "genreName")
    private List<Genre> genre;

    @Column(name = "Publisher ID")
    private long publisherId;

    @Column(name = "Price")
    private long price;


    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "book", referencedColumnName = "bookAuthorId"),
            @JoinColumn(name = "Genre", referencedColumnName = "genre")
    })
    private BookGenreId bookGenreId;

    @OneToOne
    @JoinColumn(name="publisherId")
    private Publisher publisher;

    public Book() {
    }

    public Book(BookAuthorId bookAuthorId, String bookTitle, List<Genre> genre, long publisherId, long price, BookGenreId bookGenreId, Publisher publisher) {
        this.bookAuthorId = bookAuthorId;
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.publisherId = publisherId;
        this.price = price;
        this.bookGenreId = bookGenreId;
        this.publisher = publisher;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = genre;
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

    public BookGenreId getBookGenreId() {
        return bookGenreId;
    }

    public void setBookGenreId(BookGenreId bookGenreId) {
        this.bookGenreId = bookGenreId;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public BookAuthorId getBookId() {
        return bookAuthorId;
    }

    public void setBookId(BookAuthorId bookId) {
        this.bookAuthorId = bookId;
    }

    public BookAuthorId getBookAuthorId() {
        return bookAuthorId;
    }

    public void setBookAuthorId(BookAuthorId bookAuthorId) {
        this.bookAuthorId = bookAuthorId;
    }
}
