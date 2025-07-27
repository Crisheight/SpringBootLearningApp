package com.crosa.learning.student;

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

    public List<StudentResponseDto> findAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(studentMapper::toStudentResponseDto)
                .toList();
    }

    public StudentResponseDto findStudentById(Integer id) {
        return studentRepository.findById(id)
                .map(studentMapper::toStudentResponseDto)
                .orElse(null);
    }

    public List<StudentResponseDto> findStudentByFirstName(String name) {
        return studentRepository.findAllByFirstNameContaining(name)
                .stream()
                .map(studentMapper::toStudentResponseDto)
                .toList();
    }

    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
} // End StudentService
