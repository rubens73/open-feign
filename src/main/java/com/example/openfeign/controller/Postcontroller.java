package com.example.openfeign.controller;

import com.example.openfeign.DTO.PostDTO;
import com.example.openfeign.clientFeign.PostClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/posts")
public class Postcontroller {

    private static final Logger logger = LogManager.getLogger(Postcontroller.class);

    private PostClient postClient;

    @GetMapping
    public List<PostDTO> getAllPosts() {
        logger.info("Acessando a lista de posts");
        return postClient.getAllPosts();
    }

    @GetMapping(value = "/{id}")
    public PostDTO getAllPosts(@PathVariable Integer id) {

        logger.info("Acessando posts por id");
        return postClient.getPostById(id);
    }

    @GetMapping(value = "/{id}/comments")
    public List<PostDTO> getAllPostComments(@PathVariable Integer id) {
        return postClient.getPostByIdAndComments(id);
    }

    @PostMapping
    void postPost(@RequestBody PostDTO postDTO){
        postClient.postPost(postDTO);
    }
}