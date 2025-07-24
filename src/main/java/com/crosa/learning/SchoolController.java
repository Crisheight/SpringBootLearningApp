package com.crosa.learning;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {
    private final SchoolRepository schoolRepository;

    private School toSchool(SchoolDto dto) {
        return new School(
                dto.name()
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
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @DeleteMapping("/schools/{school-id}")
    public void deleteById(
            @PathVariable("school-id") Integer id
            ) {
        schoolRepository.deleteById(id);
    }

}
