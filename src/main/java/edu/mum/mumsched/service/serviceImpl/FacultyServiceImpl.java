package edu.mum.mumsched.service.serviceImpl;

import edu.mum.mumsched.domain.Faculty;
import edu.mum.mumsched.dto.EntryDto;
import edu.mum.mumsched.dto.FacultyDto;
import edu.mum.mumsched.repository.FacultyRepository;
import edu.mum.mumsched.service.FacultyService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class FacultyServiceImpl implements FacultyService {
    private FacultyRepository facultyRepository;
    private ModelMapper modelMapper;


    public FacultyServiceImpl(FacultyRepository facultyRepository, ModelMapper modelMapper) {
        this.facultyRepository = facultyRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public FacultyDto inserFaculty(FacultyDto facultyDto) {
        Faculty facultyToSave=modelMapper.map(facultyDto,Faculty.class);
        Faculty facultySaved=facultyRepository.save(facultyToSave);

        return modelMapper.map(facultySaved, FacultyDto.class);    }

    @Override
    public List<FacultyDto> getAllFaculties() {
        return  facultyRepository.findAll().stream()
                .map(faculty -> modelMapper.map(faculty, FacultyDto.class))
                .collect(Collectors.toList());
    }
}
