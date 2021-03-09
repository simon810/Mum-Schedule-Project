package edu.mum.mumsched.repository;


import edu.mum.mumsched.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
