package com.crosa.learning.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentMapper studentMapper;
    @Mock
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void saveStudent_shouldReturnSavedStudentResponseDto() {
        StudentDto dto = new StudentDto(
                "John",
                "Doe",
                "jd@mail.com",
                1
        );

        Student student = new Student(
                "John",
                "Doe",
                "jd@mail.com",
                20
        );

        Student savedStudent = new Student(
                "John",
                "Doe",
                "jd@mail.com",
                20
        );

        savedStudent.setId(1);

        when(studentMapper.toStudent(dto))
                .thenReturn(student);

        when(studentRepository.save(student))
                .thenReturn(savedStudent);

        when(studentMapper.toStudentResponseDto(savedStudent))
                .thenReturn(new StudentResponseDto(
                        "John",
                        "Doe",
                        "jd@mail.com")
                );

        StudentResponseDto studentResponseDto = studentService.saveStudent(dto);

        assertEquals(dto.firstName(), studentResponseDto.firstName());
        assertEquals(dto.lastName(), studentResponseDto.lastName());
        assertEquals(dto.email(), studentResponseDto.email());


        verify(studentMapper, times(1))
                .toStudent(dto);
        verify(studentRepository, times(1))
                .save(student);
        verify(studentMapper, times(1))
                .toStudentResponseDto(savedStudent);
    }
} // End StudentServiceTest