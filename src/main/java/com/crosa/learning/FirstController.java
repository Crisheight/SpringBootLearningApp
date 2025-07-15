package com.crosa.learning;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    private final StudentRepository studentRepository;

    public FirstController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/students")
    public Student post(@RequestBody Student student) {
        return studentRepository.save(student);
    }
} // End FirstController
