package com.api.service;

import com.api.model.dto.CardDto;
import com.api.model.request.CardRequest;

public interface CardService {
    CardDto save(CardRequest cardRequest);

    CardDto getById(Long id);
}
