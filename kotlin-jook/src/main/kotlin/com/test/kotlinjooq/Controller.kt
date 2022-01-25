package com.test.kotlinjooq

import com.test.kotlinjooq.db.mysql.tables.pojos.Book
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/books")
class Controller(
    val sampleService: SampleService
) {

    @PostMapping
    fun addBook(@RequestBody book: Book): String{
        sampleService.insertBook(book)
        return "book add"
    }

    @GetMapping
    fun getBooks() : List<Book> {
        return sampleService.getBooks()
    }

}