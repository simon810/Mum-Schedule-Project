package edu.mum.mumsched.repository;

import edu.mum.mumsched.domain.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry,Long> {
}
