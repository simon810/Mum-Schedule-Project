package edu.mum.mumsched.dto;

import edu.mum.mumsched.domain.EntryType;
import edu.mum.mumsched.domain.Student;
import lombok.Data;

import java.util.List;

@Data
public class EntryDto {
    private Long id;
    private EntryType entryType;
    private List<Student> students;
}
