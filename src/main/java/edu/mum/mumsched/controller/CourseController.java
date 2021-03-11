package edu.mum.mumsched.controller;

import edu.mum.mumsched.dto.CourseDto;
import edu.mum.mumsched.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseDto> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/course")
    @ResponseStatus(HttpStatus.OK)
    public CourseDto getCourseById(@RequestParam Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping("/course")
    @ResponseStatus(HttpStatus.CREATED)
    public CourseDto insertCourse(@RequestBody CourseDto courseDto) {
        return courseService.insertCourse(courseDto);
    }

    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);

    }

    @PatchMapping("/course")
    @ResponseStatus(HttpStatus.OK)
    public CourseDto updateCourse(@RequestBody CourseDto courseDto) {
        return courseService.updateCourse(courseDto);
    }
}
