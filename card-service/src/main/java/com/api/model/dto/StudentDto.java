package com.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto {
    private Long studentId;
    private String name;
    private String gender;
    private String email;
}
