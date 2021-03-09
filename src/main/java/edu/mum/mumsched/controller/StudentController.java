package edu.mum.mumsched.controller;

import edu.mum.mumsched.dto.StudentDto;
import edu.mum.mumsched.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/studentbyid")
    @ResponseStatus(HttpStatus.OK)
    public StudentDto getStudentById(@RequestParam Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    public StudentDto getStudentById(@RequestBody StudentDto studentDto) {
        return studentService.insertStudent(studentDto);
    }

    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);

    }

    @PatchMapping("/student")
    @ResponseStatus(HttpStatus.OK)
    public StudentDto updateStudent(@RequestBody StudentDto studentDto) {
        return studentService.updateStudent(studentDto);
    }

}
