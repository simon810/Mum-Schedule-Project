package edu.mum.mumsched.controller;

import edu.mum.mumsched.dto.FacultyDto;
import edu.mum.mumsched.service.FacultyService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultyController {
    private FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping("/faculty")
    @ResponseStatus(HttpStatus.CREATED)
    public FacultyDto insertFaculty(@RequestBody FacultyDto facultyDto){
        return facultyService.inserFaculty(facultyDto);
    }

    @GetMapping("/facalties")
    @ResponseStatus(HttpStatus.OK)
    public List<FacultyDto> getAllFaculties() {
        return facultyService.getAllFaculties();
    }
}
