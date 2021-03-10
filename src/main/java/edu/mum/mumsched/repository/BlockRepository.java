package edu.mum.mumsched.repository;

import edu.mum.mumsched.domain.Block;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockRepository extends JpaRepository<Block,Long> {
}
