package com.api.controller;

import com.api.model.request.StudentRequest;
import com.api.service.StudentService;
import com.api.util.APIResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody StudentRequest studentRequest){
        return ResponseEntity.ok(
                APIResponseUtil.apiResponse(
                        studentService.save(studentRequest),
                        HttpStatus.CREATED
                )
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(
                APIResponseUtil.apiResponse(
                        studentService.getById(id),
                        HttpStatus.OK
                )
        );
    }
}
