package edu.mum.mumsched.dto;

import lombok.Data;

import java.util.List;

@Data
public class CourseDto {

    private Long id;
    private String courseCode;
    private String title;
    private List<String> sections;
    private FacultyDto faculty;

}
