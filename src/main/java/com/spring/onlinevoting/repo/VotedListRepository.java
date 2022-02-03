package com.spring.onlinevoting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.onlinevoting.entity.VotedList;

@Repository
public interface VotedListRepository extends JpaRepository<VotedList,Integer>{

}
