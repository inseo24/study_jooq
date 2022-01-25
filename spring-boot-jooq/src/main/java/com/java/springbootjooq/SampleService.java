package com.java.springbootjooq;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;

import java.util.List;

@Service
public class SampleService {

    private DSLContext dslContext;

    public SampleService(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public void insertBook(Book book) {
        dslContext.insertInto(Tables.BOOK, Tables.BOOK.ID, Tables.BOOK.TITLE, Tables.BOOK.AUTHOR)
                .values(book.getId(), book.getTitle(), book.getAuthor())
                .execute();
    }

    public List<Book> getBooks() {
        return dslContext.selectFrom(Tables.BOOK)
                .fetchInto(Book.class);
    }

}
