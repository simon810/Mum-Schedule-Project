package edu.mum.mumsched.repository;

import edu.mum.mumsched.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
}
