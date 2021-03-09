package edu.mum.mumsched.service.serviceImpl;

import edu.mum.mumsched.domain.Student;
import edu.mum.mumsched.dto.StudentDto;
import edu.mum.mumsched.repository.StudentRepository;
import edu.mum.mumsched.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    ModelMapper modelMapper;
    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student= studentRepository.findById(id).orElse(null);
        if (student==null) throw new RuntimeException("Student Not Found!");

        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public List<StudentDto> getAllStudents() {

        return studentRepository.findAll().stream()
                .map(student -> modelMapper.map(student,StudentDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto insertStudent(StudentDto studentDto) {
        Student studentToSave=modelMapper.map(studentDto,Student.class);
        Student studentSaved=studentRepository.save(studentToSave);

        return modelMapper.map(studentSaved,StudentDto.class);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto) {
        Student studentToUpdate=modelMapper.map(studentDto,Student.class);
        return modelMapper.map(studentRepository.save(studentToUpdate),StudentDto.class);
    }
}
