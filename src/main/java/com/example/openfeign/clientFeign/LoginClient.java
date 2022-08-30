package com.example.openfeign.clientFeign;

import com.example.openfeign.DTO.Book;
import com.example.openfeign.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 *  Interface para implementar os métodos que serão usados no desenvolvimento.
 * @author Rubens Lima
 * @version 1.0
 * @since Release 02 da aplicação
 */
@FeignClient(name = "login", url = "${api.login.url}", configuration = FeignConfiguration.class)
public interface LoginClient {

    @GetMapping(value = "/books")
    List<Book> getAllLivros();
}
