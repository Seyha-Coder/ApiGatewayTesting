package com.api.model.entity;

import com.api.model.dto.StudentDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String name;
    private String gender;
    private String email;

    public StudentDto toStudentResponse() {
        return new StudentDto(this.studentId, this.name, this.gender, this.email);
    }
}
