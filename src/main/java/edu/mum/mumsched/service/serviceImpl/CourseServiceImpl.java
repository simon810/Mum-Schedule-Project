package edu.mum.mumsched.service.serviceImpl;

import edu.mum.mumsched.domain.Course;
import edu.mum.mumsched.dto.CourseDto;
import edu.mum.mumsched.repository.CourseRepository;
import edu.mum.mumsched.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository;
    private ModelMapper modelMapper;

    public CourseServiceImpl(CourseRepository courseRepository, ModelMapper modelMapper) {
        this.courseRepository = courseRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CourseDto getCourseById(Long id) {
        Course course= courseRepository.findById(id).orElse(null);
        if (course==null) throw new RuntimeException("Course Not Found!");

        return modelMapper.map(course, CourseDto.class);
    }

    @Override
    public List<CourseDto> getAllCourses() {
        return  courseRepository.findAll().stream()
                .map(course -> modelMapper.map(course,CourseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public CourseDto insertCourse(CourseDto courseDto) {
        Course courseToSave=modelMapper.map(courseDto,Course.class);
        Course courseSaved=courseRepository.save(courseToSave);

        return modelMapper.map(courseSaved,CourseDto.class);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public CourseDto updateCourse(CourseDto courseDto) {
        Course courseToUpdate=modelMapper.map(courseDto,Course.class);
        return modelMapper.map(courseRepository.save(courseToUpdate),CourseDto.class);    }
}
