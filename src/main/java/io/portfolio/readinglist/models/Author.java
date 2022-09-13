package io.portfolio.readinglist.models;

import javax.persistence.*;

@Entity
@Table(name="Authors")
public class Author {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column (name="Author ID")
    private long authorId;

    @Column(name = "Author First Name")
    private String firstName;

    @Column(name = "Author Last Name")
    private String lastName;

    public Author(long authorId, String firstName, String lastName) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author() {
    }


    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
