package io.portfolio.readinglist.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class WishList {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long bookId;

    @Column(name = "Title")
    private String bookTitle;

    @Column(name = "Pages")
    private int totalPages;

    @Column(name = "Genre Name")
    private String genreName;





}
