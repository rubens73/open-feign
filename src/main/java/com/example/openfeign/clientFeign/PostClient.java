package com.example.openfeign.clientFeign;

import com.example.openfeign.DTO.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Interface para implementar os métodos que serão usados no desenvolvimento.
 * @author Rubens Lima
 * @version 1.0
 * @since Release 01 da aplicação
 */
@FeignClient(name = "post", url = "${api.post.url}")
public interface PostClient {

    /**
     * Método get que retorna todos os post
     * @author Rubens Lima
     * @param
     * @return Lista de posts
     * @version 1.0
     * */
    @GetMapping(value = "/posts")
    List<PostDTO> getAllPosts();

    /**
     * Método get que retorna um get especifico por id
     * @author Rubens Lima
     * @param id
     * @return Lista de posts
     * @version 1.0
     * */
    @GetMapping(value = "/posts/{id}")
    PostDTO getPostById(@RequestParam(value = "id") Integer id);

    /**
     * Método get que retorna uma lista de comentarios por ID
     * @author Rubens Lima
     * @param id
     * @return Lista de posts
     * @version 1.0
     * */
    @GetMapping(value = "/posts/{id}/comments")
    List<PostDTO> getPostByIdAndComments(@RequestParam(value = "id") Integer id);

    /**
     * Método post para salvar um comentario
     * @author Rubens Lima
     * @param postDTO
     * @version 1.0
     * */
    @PostMapping
    void postPost(@RequestBody PostDTO postDTO);


}