package com.service;
import com.vaishu.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.management.relation.RelationTypeNotFoundException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repo.StudentRepository;

import payloads.MessageResponse;
import payloads.StudentRequest;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public MessageResponse createStudent(StudentRequest studentRequest) {
    	Student newStudent = new Student();
    	newStudent.setFirstName(studentRequest.getFirstName());
    	newStudent.setLastname(studentRequest.getLastname());
    	newStudent.setPhoneNumber(studentRequest.getPhoneNumber());
    	newStudent.setEmail(studentRequest.getEmail());
    	newStudent.setSalary(studentRequest.getSalary());
        studentRepository.save(newStudent);
        return new MessageResponse("New Student created successfully");

    }

    @Override
    public Optional<Student> updateStudent(Integer studentId, StudentRequest studentRequest) throws Throwable{
        Optional<Student> student = studentRepository.findById(studentId);
        if (student.empty() != null)
        
        {
        throw new Exception("Student");
        }
        else
        student.get().setFirstName(studentRequest.getFirstName());
        student.get().setLastname(studentRequest.getLastname());
        student.get().setPhoneNumber(studentRequest.getPhoneNumber());
        student.get().setEmail(studentRequest.getEmail());
        student.get().setSalary(studentRequest.getSalary());
        studentRepository.save(student.get());
        return student;
    }

    
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

	@Override
	public void deleteStudent(Integer StudentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getASingleStudent(Integer StudentId) {
		// TODO Auto-generated method stub
		return null;
	}
}