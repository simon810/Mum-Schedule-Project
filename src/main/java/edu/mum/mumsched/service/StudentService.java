package edu.mum.mumsched.service;

import edu.mum.mumsched.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto getStudentById(Long id);
    List<StudentDto> getAllStudents();
    StudentDto insertStudent(StudentDto studentDto);
    void deleteStudent(Long id);
    StudentDto updateStudent(StudentDto studentDto);
}
