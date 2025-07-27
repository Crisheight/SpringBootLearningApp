package com.crosa.learning;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SchoolController {
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }


    @PostMapping("/schools")
    public SchoolDto create(
            @RequestBody SchoolDto dto
            ) {
        return schoolService.create(dto);
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
