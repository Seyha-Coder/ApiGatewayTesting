package com.api.feignclient;

import com.api.model.dto.StudentDto;
import com.api.response.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "student-service")
public interface StudentClient {

    @GetMapping("/api/v1/student/{id}")
    ApiResponse<StudentDto> findById(@PathVariable("id") Long id);
}
