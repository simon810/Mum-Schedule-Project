package edu.mum.mumsched.dto;

import lombok.Data;

import java.util.List;

@Data
public class ScheduleDto {
    private Long id;
    private List<BlockDto> blocks;
}
