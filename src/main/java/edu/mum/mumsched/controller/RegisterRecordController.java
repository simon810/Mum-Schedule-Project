package edu.mum.mumsched.controller;

import edu.mum.mumsched.dto.RegisterRecordDto;
import edu.mum.mumsched.dto.StudentDto;
import edu.mum.mumsched.service.RegisterRecordService;
import edu.mum.mumsched.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register-record")
public class RegisterRecordController {


    private RegisterRecordService registerRecordService;

    public RegisterRecordController(RegisterRecordService registerRecordService) {
        this.registerRecordService = registerRecordService;
    }


    @GetMapping("/records")
    @ResponseStatus(HttpStatus.OK)
    public List<RegisterRecordDto> getAllRegisterRecords() {
        return registerRecordService.getAllRecords();
    }

    @GetMapping("/record")
    @ResponseStatus(HttpStatus.OK)
    public RegisterRecordDto getRegisteredRecordById(@RequestParam Long id) {
        return registerRecordService.getRecordById(id);
    }

    @PostMapping("/record")
    @ResponseStatus(HttpStatus.CREATED)
    public RegisterRecordDto insertRegisterRecord(@RequestBody RegisterRecordDto registerRecordDto) {
        return registerRecordService.insertRegisterRecord(registerRecordDto);
    }

    @DeleteMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteRegisteredRecord(@PathVariable Long id) {
        registerRecordService.deleteRegisterRecord(id);

    }

    @PatchMapping("/record")
    @ResponseStatus(HttpStatus.OK)
    public RegisterRecordDto updateRegisteredRecord(@RequestBody RegisterRecordDto registerRecordDto) {
        return registerRecordService.updateRegisterRecord(registerRecordDto);
    }

}
