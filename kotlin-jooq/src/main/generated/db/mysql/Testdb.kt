/*
 * This file is generated by jOOQ.
 */
package db.mysql


import db.mysql.tables.Author
import db.mysql.tables.Book

import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Testdb : SchemaImpl("testdb", DefaultCatalog.DEFAULT_CATALOG) {
    public companion object {

        /**
         * The reference instance of <code>testdb</code>
         */
        val TESTDB: Testdb = Testdb()
    }

    /**
     * The table <code>testdb.author</code>.
     */
    val AUTHOR: Author get() = Author.AUTHOR

    /**
     * The table <code>testdb.book</code>.
     */
    val BOOK: Book get() = Book.BOOK

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getTables(): List<Table<*>> = listOf(
        Author.AUTHOR,
        Book.BOOK
    )
}
