package com.example.feignclient.controllers;

import com.example.feignclient.model.Book;
import com.example.feignclient.util.FeignBookServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class FeignBookController {

    private final FeignBookServiceUtil feignBookServiceUtil;

    @Autowired
    public FeignBookController(FeignBookServiceUtil feignBookServiceUtil) {
        this.feignBookServiceUtil = feignBookServiceUtil;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(feignBookServiceUtil.getAllBooks());
    }

    @PostMapping("/new")
    public ResponseEntity<Book> addNewBook(@RequestBody Book book) {
        return ResponseEntity.ok(feignBookServiceUtil.addNewBook(book));
    }
}
