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

import com.spring.onlinevoting.entity.ElectionResult;
import com.spring.onlinevoting.service.ElectionResultService;

@RestController
public class ElectionResultController {
    @Autowired
	ElectionResultService electionResultService;
	
	@PostMapping("/elections")
	public ElectionResult
	createElection(@Valid@RequestBody ElectionResult electionResult)
	{
		return electionResultService.createElectionResult(electionResult);
	}
	
	@GetMapping("/elections")
	public List<ElectionResult> getelectionResults(){
		return electionResultService.getelectionResults();
	}
	
	@DeleteMapping("/elections")
	public boolean deleteElectionResult() {
		return electionResultService.deleteElectionResult();
		
	}
	@PutMapping("/elections/{electionresultId} ")
	public ElectionResult updateElectionResult(@PathVariable int electionResultId, @RequestBody ElectionResult obj) {
		return electionResultService.updateElectionResult(electionResultId, obj);

	}
}
