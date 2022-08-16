package io.portfolio.readinglist.readlist;

import io.portfolio.readinglist.readlist.ReadList;

import java.util.List;

public interface ReadListService {
    ReadList createReadList(ReadList readBook);
    ReadList updateReadList(ReadList readBook);
    List<ReadList> getAllReadBooks();
    ReadList getReadBookByID(long readBookId);
    void deleteReadBook(long readBookId);
}
