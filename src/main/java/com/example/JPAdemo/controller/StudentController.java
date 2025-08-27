package com.example.JPAdemo.controller;

import com.example.JPAdemo.models.Student;
import com.example.JPAdemo.repository.StudentRepo;
import com.example.JPAdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getALLStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/students/{rno}")
    public Student getStudentBYRno(@PathVariable("rno") int rno){
        return studentService.getStudentBYRno(rno);
    }
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Added...";
    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Updated";
    }
    @DeleteMapping("/students/{rno}")
    public String deleteStudent(@PathVariable int rno){
        studentService.deleteStudentByRno(rno);
        return "Deleted";
    }
    @DeleteMapping("/students/clear")
    public String clearStudent(){
        studentService.clearStudent();
        return "Cleared Students records";
    }
}
