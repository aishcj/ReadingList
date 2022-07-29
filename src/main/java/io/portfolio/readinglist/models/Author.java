package io.portfolio.readinglist.models;

import javax.persistence.*;

@Entity
@Table(name="Authors")
public class Author {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long authorId;

    @Column(name = "Publisher Name")
    private String FirstName;

    @Column(name = "Publisher Name")
    private String LastName;

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
