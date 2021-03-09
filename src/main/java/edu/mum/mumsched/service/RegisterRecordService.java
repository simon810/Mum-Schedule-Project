package edu.mum.mumsched.service;

import edu.mum.mumsched.dto.RegisterRecordDto;

import java.util.List;

public interface RegisterRecordService {
    RegisterRecordDto getRecordById(Long id);
    List<RegisterRecordDto> getAllRecords();
    RegisterRecordDto insertRegisterRecord(RegisterRecordDto registerRecordDto);
    void deleteRegisterRecord(Long id);
    RegisterRecordDto updateRegisterRecord(RegisterRecordDto registerRecordDto);
}
