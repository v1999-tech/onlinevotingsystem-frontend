package com.spring.onlinevoting.ctrl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.onlinevoting.entity.ElectionOfficer;
import com.spring.onlinevoting.service.ElectionOfficerService;

@RestController
public class ElectionOfficerController {
	@Autowired
	ElectionOfficerService electionOfficerService;
	
	@PostMapping("/electionOfficers")
	public ElectionOfficer
	createElectionOfficer(@Valid@RequestBody ElectionOfficer electionOfficer)
	{
		return electionOfficerService.createElectionOfficer(electionOfficer);
	}
	
	@GetMapping("/electionOfficers")
	public List<ElectionOfficer> getElectionOfficers(){
		return electionOfficerService.getElectionOfficers();
	}
	
	@DeleteMapping("/electionOfficers")
	public boolean deleteElectionOfficer() {
		return electionOfficerService.deleteElectionOfficer();
		
	}
	@PutMapping("/electionOfficers/{electionOfficerId} ")
	public ElectionOfficer updateElectionOfficer(@PathVariable int electionOfficerId, @RequestBody ElectionOfficer obj) {
		return electionOfficerService.updateElectionOfficer(electionOfficerId, obj);

	}

}
