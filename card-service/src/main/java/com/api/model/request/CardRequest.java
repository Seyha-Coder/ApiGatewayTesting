package com.api.model.request;

import com.api.model.entity.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardRequest {
    private UUID cardNumber;
    private Long studentId;

    public Card toEntity() {
        return new Card(null, this.cardNumber, this.studentId);
    }
}
