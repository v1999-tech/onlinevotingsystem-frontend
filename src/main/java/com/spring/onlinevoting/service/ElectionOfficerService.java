package com.spring.onlinevoting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onlinevoting.entity.ElectionOfficer;
import com.spring.onlinevoting.repo.ElectionOfficerRepository;

@Service
public class ElectionOfficerService {
	@Autowired
	ElectionOfficerRepository electionOfficerRepository;

	public ElectionOfficer createElectionOfficer(ElectionOfficer electionOfficer) {
		return electionOfficerRepository.save(electionOfficer);
	}

	public List<ElectionOfficer> getElectionOfficers() {
		return electionOfficerRepository.findAll();
	}
	
	public boolean deleteElectionOfficer() {
		try {
			electionOfficerRepository.deleteAll();
		}
		catch(Exception e) {
			return true;
		}
		return false;
		
	}

	public ElectionOfficer updateElectionOfficer(int electionOfficerId, ElectionOfficer obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
