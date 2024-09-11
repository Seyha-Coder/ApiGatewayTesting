package com.api.service.serviceImpl;

import com.api.feignclient.StudentClient;
import com.api.model.dto.CardDto;
import com.api.model.dto.StudentDto;
import com.api.model.request.CardRequest;
import com.api.repository.CardRepository;
import com.api.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;
    private final StudentClient studentClient;

    private StudentDto getStudentById(Long studentId){
        return studentClient.findById(studentId).getPayload();
    }

    @Override
    public CardDto save(CardRequest cardRequest) {
        return cardRepository
                .save(cardRequest.toEntity())
                .toCardResponse(getStudentById(cardRequest.getStudentId()));
    }

    @Override
    public CardDto getById(Long id) {
        return cardRepository.findById(id)
                .map(c -> c.toCardResponse(getStudentById(c.getStudentId())))
                .orElse(null);
    }
}
