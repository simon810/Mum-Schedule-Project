package edu.mum.mumsched.service;

import edu.mum.mumsched.dto.ScheduleDto;

import java.util.List;

public interface ScheduleService {
    List<ScheduleDto> getAllSchedules();
}
