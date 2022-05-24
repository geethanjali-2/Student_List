package com.eproject.usecase.service;

import com.eproject.usecase.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    void saveStudent(Student student);
}
