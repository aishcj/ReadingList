package io.portfolio.readinglist.publishers;

import io.portfolio.readinglist.publishers.Publisher;

import java.util.List;

public interface PublisherService {
    Publisher createPublisher(Publisher publisher);
    Publisher updatePublisher(Publisher publisher);
    List<Publisher> getAllPublishers();
    Publisher getPublisherByID(long publisherId);
    void deletePublisher(long publisherId);
}
