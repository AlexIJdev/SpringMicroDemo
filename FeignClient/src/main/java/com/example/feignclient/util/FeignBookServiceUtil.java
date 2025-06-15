package com.example.feignclient.util;

import com.example.feignclient.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "feignBookDemo", url = "http://localhost:8081/api")
public interface FeignBookServiceUtil {

    @GetMapping("/books")
    List<Book> getAllBooks();

    @PostMapping("/new")
    Book addNewBook(Book book);
}
