package com.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.vaishu.model.Student;

import payloads.MessageResponse;
import payloads.StudentRequest;

@Component
public interface StudentService {
    MessageResponse createStudent(StudentRequest studentRequest);
    Optional<Student> updateStudent(Integer studentId, StudentRequest studentRequest) throws Throwable;
    void deleteStudent(Integer StudentId);
    Student getASingleStudent(Integer StudentId);
    List<Student> getAllStudent();
}

