package edu.mum.mumsched.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterRecordDto {
    private Long id;
    private String block;
    private String courseCode;
    private String title;
    private String faculty;
    private LocalDate startDate;
}
