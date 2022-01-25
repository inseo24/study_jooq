package com.java.springbootjooq;

import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/books")
public class SpringBootJooqApplication {

    private SampleService sampleService;

    public SpringBootJooqApplication(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @PostMapping
    public String addBook(@RequestBody Book book){
        sampleService.insertBook(book);
        return "book add";
    }

    @GetMapping
    public List<Book> getBooks() {
        return sampleService.getBooks();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJooqApplication.class, args);
    }

}
