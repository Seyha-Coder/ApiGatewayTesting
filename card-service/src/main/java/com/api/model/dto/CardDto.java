package com.api.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
public class CardDto {
    private Long id;
    private UUID cardNumber;
    private StudentDto student;

    public CardDto(Long id, UUID cardNumber, StudentDto student) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.student = student;
    }
}
