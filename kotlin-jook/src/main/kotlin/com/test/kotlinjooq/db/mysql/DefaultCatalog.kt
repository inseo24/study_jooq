/*
 * This file is generated by jOOQ.
 */
package com.test.kotlinjooq.db.mysql


import kotlin.collections.List

import org.jooq.Schema
import org.jooq.impl.CatalogImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DefaultCatalog : CatalogImpl("") {
    companion object {

        /**
         * The reference instance of <code>DEFAULT_CATALOG</code>
         */
        val DEFAULT_CATALOG = DefaultCatalog()
    }

    /**
     * The schema <code>testdb</code>.
     */
    val TESTDB get() = Testdb.TESTDB

    override fun getSchemas(): List<Schema> = listOf(
        Testdb.TESTDB
    )
}
