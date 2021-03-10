package edu.mum.mumsched.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class BlockDto {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String blockName;
    private List<CourseDto> courses;
    private List<FacultyDto> faculties;
}
