package com.spring.onlinevoting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.onlinevoting.entity.ElectionResult;
@Repository
public interface ElectionResultRepository extends JpaRepository<ElectionResult,Integer>{

}
