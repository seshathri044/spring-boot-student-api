package com.example.JPAdemo.service;

import com.example.JPAdemo.models.Student;
import com.example.JPAdemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public Student getStudentBYRno(int rno) {
        return studentRepo.findById(rno).orElse(new Student());
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudentByRno(int rno) {
        studentRepo.deleteById(rno);
    }

    public void clearStudent() {
        studentRepo.deleteAll();
    }
}
