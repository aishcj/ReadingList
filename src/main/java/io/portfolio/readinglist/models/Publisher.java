package io.portfolio.readinglist.models;

import javax.persistence.*;

@Entity
@Table(name="Publishers")
public class Publisher {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long publisherId;

    @Column(name = "Publisher Name")
    private String publisherName;

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
