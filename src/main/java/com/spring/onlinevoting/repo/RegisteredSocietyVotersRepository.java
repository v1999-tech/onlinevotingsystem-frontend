package com.spring.onlinevoting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.onlinevoting.entity.RegisteredSocietyVoters;
@Repository
public interface RegisteredSocietyVotersRepository extends JpaRepository<RegisteredSocietyVoters,Integer> {

}
