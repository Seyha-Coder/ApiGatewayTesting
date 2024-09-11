package com.api.controller;

import com.api.model.request.CardRequest;
import com.api.service.CardService;
import com.api.util.APIResponseUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/card/")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;
    @Value("${server.port}")
    private String port;

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody CardRequest cardRequest){
        return ResponseEntity.ok(
                APIResponseUtil.apiResponse(
                        cardService.save(cardRequest),
                        HttpStatus.CREATED
                )
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        System.out.println("server port : " + port);
        return ResponseEntity.ok(
                APIResponseUtil.apiResponse(
                        cardService.getById(id),
                        HttpStatus.OK
                )
        );
    }
}
