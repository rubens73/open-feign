package com.example.openfeign.controller;

import com.example.openfeign.DTO.Book;
import com.example.openfeign.clientFeign.LoginClient;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping
public class BookController {

    private static final Logger logger = LogManager.getLogger(BookController.class.getName());

    private LoginClient client;

    @GetMapping(value = "/books")
    public List<Book> getAllPosts() {
        logger.info("Acessando a lista de posts");
        return client.getAllLivros();
    }
}
