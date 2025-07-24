package com.crosa.learning;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SchoolController {
    private final SchoolRepository schoolRepository;

    private School toSchool(SchoolDto dto) {
        return new School(
                dto.name()
        );
    }

    private SchoolDto toSchoolDto(School school) {
        return new SchoolDto(
                school.getName()
        );
    }

    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }


    @PostMapping("/schools")
    public SchoolDto create(
            @RequestBody SchoolDto dto
            ) {
        var school = toSchool(dto);
        schoolRepository.save(school);

        return dto;
    }


    @GetMapping("/schools")
    public List<SchoolDto> findAll() {
        return schoolRepository.findAll()
                .stream()
                .map(this::toSchoolDto)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/schools/{school-id}")
    public void deleteById(
            @PathVariable("school-id") Integer id
            ) {
        schoolRepository.deleteById(id);
    }

}
