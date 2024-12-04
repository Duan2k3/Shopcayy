package com.example.shop.responses;

import com.example.shop.models.Category;
import com.fasterxml.jackson.annotation.JsonProperty;
//import jdk.jfr.Category;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryResponse {
    @JsonProperty("message")
    private String message;

    @JsonProperty("errors")
    private List<String> errors;

    @JsonProperty("category")
    private Category category;
}
