package com.crosa.learning;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public StudentResponseDto saveStudent(
            StudentDto dto
    ) {
        var student = studentMapper.toStudent(dto);
        var savedStudent = studentRepository.save(student);
        return studentMapper.toStudentResponseDto(savedStudent);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student findStudentById(Integer id) {
        return studentRepository.findById(id)
                .orElse(new Student());
    }

    public List<Student> findStudentByName(String name) {
        return studentRepository.findAll()
                .stream()
                .filter(student -> student.getFirstName().equalsIgnoreCase(name) ||
                                   student.getLastName().equalsIgnoreCase(name))
                .toList();
    }

    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
} // End StudentService
