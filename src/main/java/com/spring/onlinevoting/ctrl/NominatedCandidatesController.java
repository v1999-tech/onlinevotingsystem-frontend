package com.spring.onlinevoting.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.onlinevoting.entity.NominatedCandidates;
import com.spring.onlinevoting.exception.VoterListEmptyException;
import com.spring.onlinevoting.service.NominatedCandidatesService;

@RestController
public class NominatedCandidatesController {
	@Autowired
	NominatedCandidatesService nominatedCandidatesService;
	
	@PostMapping("/nominatedCandidates")
	public NominatedCandidates
	createNominatedCandidates(@RequestBody NominatedCandidates nominatedCandidates) throws VoterListEmptyException 
	{
		return nominatedCandidatesService.createNominatedCandidates(nominatedCandidates);
	}
	
	@GetMapping("/nominatedCandidates")
	public List<NominatedCandidates> getNominatedCandidates(){
		return nominatedCandidatesService.getNominatedCandidates();
	}
	
	@DeleteMapping("/nominatedCandidates")
	public boolean deleteNominatedCandidate() {
		return nominatedCandidatesService.deleteNominatedCandidates();
		
	}
	
	@PutMapping("/nominatedCandidates/{candidatesId} ")
	public NominatedCandidates updateNominatedCandidates(@PathVariable int candidatesId, @RequestBody NominatedCandidates obj) {
		return nominatedCandidatesService.updateNominatedCandidates(candidatesId, obj);

	}
}
