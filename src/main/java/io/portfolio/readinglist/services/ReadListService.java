package io.portfolio.readinglist.services;

import io.portfolio.readinglist.models.ReadList;

import java.util.List;

public interface ReadListService {
    ReadList createReadList(ReadList readBook);
    ReadList updateReadList(ReadList readBook);
    List<ReadList> getAllReadBooks();
    ReadList getReadBookByID(long readBookId);
    void deleteReadBook(long readBookId);
}
