package com.spring.onlinevoting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.onlinevoting.entity.NominatedCandidates;
@Repository
public interface  NominatedCandidatesRepository extends JpaRepository<NominatedCandidates,Integer> {

}
