package io.portfolio.readinglist.authors;

import javax.persistence.*;

@Entity
@Table(name="Authors")
public class Author {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long authorId;

    @Column(name = "Author First Name")
    private String FirstName;

    @Column(name = "Author Last Name")
    private String LastName;

    public Author(long authorId, String firstName, String lastName) {
        this.authorId = authorId;
        FirstName = firstName;
        LastName = lastName;
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
