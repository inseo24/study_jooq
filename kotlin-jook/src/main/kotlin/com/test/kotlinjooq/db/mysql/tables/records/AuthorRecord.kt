/*
 * This file is generated by jOOQ.
 */
package com.test.kotlinjooq.db.mysql.tables.records


import com.test.kotlinjooq.db.mysql.tables.Author

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AuthorRecord() : UpdatableRecordImpl<AuthorRecord>(Author.AUTHOR), Record3<Int?, String?, String?> {

    var id: Int?
        set(value) = set(0, value)
        get() = get(0) as Int?

    var firstName: String?
        set(value) = set(1, value)
        get() = get(1) as String?

    var lastName: String?
        set(value) = set(2, value)
        get() = get(2) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<Int?, String?, String?> = super.fieldsRow() as Row3<Int?, String?, String?>
    override fun valuesRow(): Row3<Int?, String?, String?> = super.valuesRow() as Row3<Int?, String?, String?>
    override fun field1(): Field<Int?> = Author.AUTHOR.ID
    override fun field2(): Field<String?> = Author.AUTHOR.FIRST_NAME
    override fun field3(): Field<String?> = Author.AUTHOR.LAST_NAME
    override fun component1(): Int? = id
    override fun component2(): String? = firstName
    override fun component3(): String? = lastName
    override fun value1(): Int? = id
    override fun value2(): String? = firstName
    override fun value3(): String? = lastName

    override fun value1(value: Int?): AuthorRecord {
        this.id = value
        return this
    }

    override fun value2(value: String?): AuthorRecord {
        this.firstName = value
        return this
    }

    override fun value3(value: String?): AuthorRecord {
        this.lastName = value
        return this
    }

    override fun values(value1: Int?, value2: String?, value3: String?): AuthorRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    constructor(id: Int? = null, firstName: String? = null, lastName: String? = null): this() {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
    }
}
