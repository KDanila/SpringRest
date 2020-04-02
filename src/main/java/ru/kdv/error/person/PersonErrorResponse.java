package ru.kdv.error.person;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonErrorResponse {
    private int status;
    private String message;
    private long timpestamp;
}
