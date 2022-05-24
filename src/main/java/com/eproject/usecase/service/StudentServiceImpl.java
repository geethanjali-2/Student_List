package com.eproject.usecase.service;

import com.eproject.usecase.model.Student;
import com.eproject.usecase.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public void saveStudent(Student student){
        this.studentRepository.save(student);
    }
}
