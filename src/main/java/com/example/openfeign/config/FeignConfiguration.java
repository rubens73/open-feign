package com.example.openfeign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.HEADERS;
    }
}