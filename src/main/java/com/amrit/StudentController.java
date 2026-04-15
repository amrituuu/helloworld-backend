package com.amrit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "Student data saved successfully!";
    }

    @GetMapping
    public java.util.List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}