package com.spring.onlinevoting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.onlinevoting.entity.CooperativeSociety;
@Repository
public interface CooperativeSocietyRepository extends JpaRepository<CooperativeSociety,Integer>{

}
