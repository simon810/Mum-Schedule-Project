package edu.mum.mumsched.dto;

import edu.mum.mumsched.domain.Entry;
import edu.mum.mumsched.domain.RegisterRecord;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {

    private Long id;
    private Entry entry;
    private List<RegisterRecord> registerRecordes;
}
