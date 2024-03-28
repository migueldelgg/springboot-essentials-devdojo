package com.migueldelgado.springboot2.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@Getter
@Setter
public class ExceptionDetails {

    protected String title;
    protected int status;
    protected String details;
    protected String developerMsg;
    protected LocalDateTime timestamp;

}
