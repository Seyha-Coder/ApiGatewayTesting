package com.api.model.request;

import com.api.model.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentRequest {
    private String name;
    private String gender;
    private String email;

    public Student toEntity() {
        return new Student(null, this.name, this.gender, this.email);
    }
}
