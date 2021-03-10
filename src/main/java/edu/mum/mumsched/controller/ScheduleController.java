package edu.mum.mumsched.controller;

import edu.mum.mumsched.dto.EntryDto;
import edu.mum.mumsched.dto.ScheduleDto;
import edu.mum.mumsched.service.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    private ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/schedules")
    @ResponseStatus(HttpStatus.OK)
    public List<ScheduleDto> getAllSchedules() {
        return scheduleService.getAllSchedules();
    }
}
