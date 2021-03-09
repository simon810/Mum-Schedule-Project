package edu.mum.mumsched.service.serviceImpl;

import edu.mum.mumsched.domain.RegisterRecord;
import edu.mum.mumsched.domain.Student;
import edu.mum.mumsched.dto.RegisterRecordDto;
import edu.mum.mumsched.dto.StudentDto;
import edu.mum.mumsched.repository.RegisterRecordRepository;
import edu.mum.mumsched.service.RegisterRecordService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegisterRecordServiceImpl implements RegisterRecordService {

    private RegisterRecordRepository registerRecordRepository;
    private ModelMapper modelMapper;

    public RegisterRecordServiceImpl(RegisterRecordRepository registerRecordRepository, ModelMapper modelMapper) {
        this.registerRecordRepository = registerRecordRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public RegisterRecordDto getRecordById(Long id) {
        RegisterRecord registerRecord = registerRecordRepository.findById(id).orElse(null);
        if (registerRecord == null) throw new RuntimeException("Student Not Found!");

        return modelMapper.map(registerRecord, RegisterRecordDto.class);
    }

    @Override
    public List<RegisterRecordDto> getAllRecords() {
        return registerRecordRepository.findAll().stream()
                .map(registerRecord -> modelMapper.map(registerRecord, RegisterRecordDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public RegisterRecordDto insertRegisterRecord(RegisterRecordDto registerRecordDto) {
        RegisterRecord registerRecordToSave=modelMapper.map(registerRecordDto,RegisterRecord.class);
        RegisterRecord registerRecordSaved=registerRecordRepository.save(registerRecordToSave);

        return modelMapper.map(registerRecordSaved,RegisterRecordDto.class);
    }

    @Override
    public void deleteRegisterRecord(Long id) {
        registerRecordRepository.deleteById(id);
    }

    @Override
    public RegisterRecordDto updateRegisterRecord(RegisterRecordDto registerRecordDto) {
        RegisterRecord registerRecordToUpdate=modelMapper.map(registerRecordDto,RegisterRecord.class);
        return modelMapper.map(registerRecordRepository.save(registerRecordToUpdate),RegisterRecordDto.class);
    }
}
