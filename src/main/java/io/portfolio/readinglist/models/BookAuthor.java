package io.portfolio.readinglist.models;

import javax.persistence.*;

@Entity
public class BookAuthor {

    
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long bookId;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long authorId;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }
}
