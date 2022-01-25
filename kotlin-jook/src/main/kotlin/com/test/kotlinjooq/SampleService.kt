package com.test.kotlinjooq

import com.test.kotlinjooq.db.mysql.tables.pojos.Book
import org.springframework.stereotype.Service

import com.test.kotlinjooq.db.mysql.tables.references.*
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired

@Service
class SampleService(
    @Autowired private val dslContext: DSLContext
) {

    fun insertBook(book: Book) {
        dslContext.insertInto(BOOK, BOOK.ID, BOOK.TITLE, BOOK.AUTHOR)
            .values(book.id, book.title, book.author)
            .execute()
    }

    fun getBooks() : List<Book> {
        return dslContext.selectFrom(BOOK)
            .fetchInto(Book::class.java)
    }

}