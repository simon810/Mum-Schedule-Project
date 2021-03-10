package edu.mum.mumsched.service.serviceImpl;

import edu.mum.mumsched.dto.EntryDto;
import edu.mum.mumsched.dto.ScheduleDto;
import edu.mum.mumsched.repository.ScheduleRepository;
import edu.mum.mumsched.service.ScheduleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {

    private ScheduleRepository scheduleRepository;
    private ModelMapper modelMapper;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository, ModelMapper modelMapper) {
        this.scheduleRepository = scheduleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ScheduleDto> getAllSchedules() {
        return  scheduleRepository.findAll().stream()
                .map(schedule -> modelMapper.map(schedule, ScheduleDto.class))
                .collect(Collectors.toList());
    }
}
