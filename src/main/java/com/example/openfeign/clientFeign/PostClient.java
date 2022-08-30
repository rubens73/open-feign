package com.example.openfeign.clientFeign;

import com.example.openfeign.DTO.PostDTO;
import com.example.openfeign.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 *  Interface para implementar os métodos que serão usados no desenvolvimento.
 * @author Rubens Lima
 * @version 1.0
 * @since Release 01 da aplicação
 */
@FeignClient(name = "post", url = "${api.post.url}", configuration = FeignConfiguration.class)
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
    PostDTO getPostById(@PathVariable(value = "id") Integer id);

    /**
     * Método get que retorna uma lista de comentários por ID
     * @author Rubens Lima
     * @param id
     * @return Lista de posts
     * @version 1.0
     * */
    @GetMapping(value = "/posts/{id}/comments")
    List<PostDTO> getPostByIdAndComments(@PathVariable(value = "id") Integer id);

    /**
     * Método post para salvar um comentário
     * @author Rubens Lima
     * @param postDTO
     * @version 1.0
     * */
    @PostMapping(value = "/posts")
    void postPost(@RequestBody PostDTO postDTO);


}