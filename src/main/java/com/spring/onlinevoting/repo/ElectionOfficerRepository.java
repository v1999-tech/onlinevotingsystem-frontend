package com.spring.onlinevoting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.onlinevoting.entity.ElectionOfficer;

@Repository
public interface ElectionOfficerRepository extends JpaRepository <ElectionOfficer,Integer>{

}
