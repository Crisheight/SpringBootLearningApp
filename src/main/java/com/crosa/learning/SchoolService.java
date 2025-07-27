package com.crosa.learning;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;

    public SchoolService(SchoolRepository schoolRepository, SchoolMapper schoolMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }

    public SchoolDto create(SchoolDto dto) {
        var school = schoolMapper.toSchool(dto);
        return schoolRepository.save(school);
    }

    public List<SchoolDto> findAll() {
        return schoolRepository.findAll()
                .stream()
                .map(school -> new SchoolDto(school.getName()))
                .collect(Collectors.toList());
    }

    public void deleteById(Integer id) {
        schoolRepository.deleteById(id);
    }
}
