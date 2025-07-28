package com.crosa.learning.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty(message = "First name should not be null or empty")
        String firstName,

        @NotEmpty(message = "Last name should not be null or empty")
        String lastName,

        String email,
        Integer schoolId
) {
}
