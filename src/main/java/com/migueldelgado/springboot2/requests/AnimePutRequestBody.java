package com.migueldelgado.springboot2.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AnimePutRequestBody {
    private long id;
    @NotBlank(message = "This field cannot be null, empty, or blank")
    private String name;
}

