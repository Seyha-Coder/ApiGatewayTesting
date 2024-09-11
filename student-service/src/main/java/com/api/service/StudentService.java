package com.api.service;

import com.api.model.dto.StudentDto;
import com.api.model.request.StudentRequest;

public interface StudentService {
    StudentDto save(StudentRequest studentRequest);

    StudentDto getById(Long id);
}
