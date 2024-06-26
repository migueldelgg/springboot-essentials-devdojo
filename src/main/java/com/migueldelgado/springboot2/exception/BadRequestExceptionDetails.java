package com.migueldelgado.springboot2.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BadRequestExceptionDetails {

    private String title;
    private int status;
    private String details;
    private String developerMsg;
    private LocalDateTime timestamp;


}
