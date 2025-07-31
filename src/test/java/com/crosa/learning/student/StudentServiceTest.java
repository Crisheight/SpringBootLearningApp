package com.crosa.learning.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentMapper studentMapper;
    @Mock
    private StudentRepository studentRepository;

    private AutoCloseable closeable;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void destroy() throws Exception {
        closeable.close();
    }

    @Test
    public void saveStudent_shouldReturn_Saved_StudentResponseDto() {
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
                        "jd@mail.com"
                ));

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

    @Test
    public void findAllStudents_shouldReturn_ListOf_StudentResponseDto() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(
                "John",
                "Doe",
                "jd@mail.com",
                20
        ));

        when(studentRepository.findAll())
                .thenReturn(students);
        when(studentMapper.toStudentResponseDto(any(Student.class)))
                .thenReturn(new StudentResponseDto(
                        "John",
                        "Doe",
                        "jd@mail.com"
                ));

        List<StudentResponseDto> studentResponseDtos = studentService.findAllStudents();

        assertEquals(students.size(), studentResponseDtos.size());
        verify(studentRepository, times(1))
                .findAll();
    }

    @Test
    public void findStudentById_shouldReturn_StudentResponseDto() {
        Integer studentId = 1;
        Student student = new Student(
                "John",
                "Doe",
                "jd@mail.com",
                20
        );

        student.setId(studentId);

        when(studentRepository.findById(studentId))
                .thenReturn(Optional.of(student));

        when(studentMapper.toStudentResponseDto(any(Student.class)))
                .thenReturn(new StudentResponseDto(
                        "John",
                        "Doe",
                        "jd@mail.com"
                ));

        StudentResponseDto dto = studentService.findStudentById(studentId);
        assertEquals(dto.firstName(), student.getFirstName());
        assertEquals(dto.lastName(), student.getLastName());
        assertEquals(dto.email(), student.getEmail());

        verify(studentRepository, times(1))
                .findById(studentId);
        verify(studentMapper, times(1));
    }

} // End StudentServiceTest