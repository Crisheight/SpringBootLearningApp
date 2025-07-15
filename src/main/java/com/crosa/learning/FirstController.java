package com.crosa.learning;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{student-id}")
    public Student findStudentById(
            @PathVariable("student-id") Integer id
    ) {
        return studentRepository.findById(id)
                .orElse(new Student());
    }
} // End FirstController
