package com.crosa.learning;

public record StudentDto(
        String firstName,
        String lastName,
        String email,
        Integer schoolId
) {
}
