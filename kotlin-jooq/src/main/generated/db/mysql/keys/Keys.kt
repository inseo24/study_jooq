/*
 * This file is generated by jOOQ.
 */
package db.mysql.keys


import db.mysql.tables.Author
import db.mysql.tables.Book
import db.mysql.tables.records.AuthorRecord
import db.mysql.tables.records.BookRecord

import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val KEY_AUTHOR_PRIMARY: UniqueKey<AuthorRecord> = Internal.createUniqueKey(Author.AUTHOR, DSL.name("KEY_author_PRIMARY"), arrayOf(Author.AUTHOR.ID), true)
val KEY_BOOK_PRIMARY: UniqueKey<BookRecord> = Internal.createUniqueKey(Book.BOOK, DSL.name("KEY_book_PRIMARY"), arrayOf(Book.BOOK.ID), true)
