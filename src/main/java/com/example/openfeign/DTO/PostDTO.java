package com.example.openfeign.DTO;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PostDTO implements Serializable {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;


}