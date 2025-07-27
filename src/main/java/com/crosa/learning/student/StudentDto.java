package com.crosa.learning.student;

public record StudentDto(
        String firstName,
        String lastName,
        String email,
        Integer schoolId
) {
}
