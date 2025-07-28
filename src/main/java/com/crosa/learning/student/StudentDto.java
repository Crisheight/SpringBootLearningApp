package com.crosa.learning.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty
        String firstName,

        @NotEmpty
        String lastName,

        String email,
        Integer schoolId
) {
}
