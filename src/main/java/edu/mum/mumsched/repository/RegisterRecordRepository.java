package edu.mum.mumsched.repository;

import edu.mum.mumsched.domain.RegisterRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRecordRepository extends JpaRepository<RegisterRecord,Long> {
}
