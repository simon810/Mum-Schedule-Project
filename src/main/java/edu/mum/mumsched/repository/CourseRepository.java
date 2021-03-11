package edu.mum.mumsched.repository;

import edu.mum.mumsched.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
