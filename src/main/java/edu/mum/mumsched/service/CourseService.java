package edu.mum.mumsched.service;

import edu.mum.mumsched.dto.CourseDto;

import java.util.List;

public interface CourseService {
    CourseDto getCourseById(Long id);
    List<CourseDto> getAllCourses();
    CourseDto insertCourse(CourseDto CourseDto);
    void deleteCourse(Long id);
    CourseDto updateCourse(CourseDto CourseDto);
}
