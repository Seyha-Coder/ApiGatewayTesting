package com.api.model.entity;

import com.api.model.dto.CardDto;
import com.api.model.dto.StudentDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "card_tb")
@Getter
@Setter
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID cardNumber;
    private Long studentId;

    public Card(Long id, UUID cardNumber, Long studentId) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.studentId = studentId;
    }

    public CardDto toCardResponse(StudentDto student) {
        return new CardDto(this.id, this.cardNumber, student);
    }
}
