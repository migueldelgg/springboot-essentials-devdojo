package com.migueldelgado.springboot2.requests;

import lombok.Data;

@Data
public class AnimePutRequestBody {
    private long id;
    private String name;
}
