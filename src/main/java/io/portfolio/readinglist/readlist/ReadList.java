package io.portfolio.readinglist.readlist;

import io.portfolio.readinglist.books.Book;

import javax.persistence.*;
import java.util.List;

@Entity
public class ReadList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long readId;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "book_bookId", referencedColumnName = "bookId"),
            @JoinColumn(name = "book_authorId", referencedColumnName = "authorId")
    })
    private Book book;

    public ReadList() {
    }
    public ReadList(long readId, Book book) {
        this.readId = readId;
        this.book = book;
    }

    public long getReadListId() {
        return readId;
    }

    public void setReadListId(long readId) {
        this.readId = readId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }



}