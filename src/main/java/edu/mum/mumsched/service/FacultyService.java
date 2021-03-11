package edu.mum.mumsched.service;

import edu.mum.mumsched.domain.Faculty;
import edu.mum.mumsched.dto.FacultyDto;

import java.util.List;

public interface FacultyService {
    FacultyDto inserFaculty(FacultyDto facultyDto);
    List<FacultyDto> getAllFaculties();
}
