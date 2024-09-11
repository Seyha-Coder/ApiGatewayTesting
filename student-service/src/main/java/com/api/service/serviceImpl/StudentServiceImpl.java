package com.api.service.serviceImpl;

import com.api.model.dto.StudentDto;
import com.api.model.request.StudentRequest;
import com.api.repository.StudentRepository;
import com.api.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public StudentDto save(StudentRequest studentRequest) {
        return studentRepository.save(studentRequest.toEntity()).toStudentResponse();
    }

    @Override
    public StudentDto getById(Long id) {
        return studentRepository.findById(id).orElseThrow().toStudentResponse();
    }
}
