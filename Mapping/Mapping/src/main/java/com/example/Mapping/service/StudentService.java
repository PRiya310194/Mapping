package com.example.Mapping.service;

import com.example.Mapping.Repository.StudentRepository;
import com.example.Mapping.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).get();
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Integer studentId, Student student) {
        Student student1=studentRepository.findById(studentId).get();
        student1.setStudentAge(student.getStudentAge());
        student1.setStudentBranch(student.getStudentBranch());
        student1.setStudentName(student.getStudentName());
        student1.setStudentNumber(student.getStudentNumber());
        student1.setAddress(student.getAddress());
        student1.setStudentDepartment(student.getStudentDepartment());
        return studentRepository.save(student1);
    }

    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}
