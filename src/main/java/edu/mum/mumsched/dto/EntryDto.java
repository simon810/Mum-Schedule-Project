package edu.mum.mumsched.dto;

import edu.mum.mumsched.domain.EntryType;
import lombok.Data;

import java.util.List;

@Data
public class EntryDto {
    private Long id;
    private EntryType entryType;
    private List<StudentDto> students;
}
