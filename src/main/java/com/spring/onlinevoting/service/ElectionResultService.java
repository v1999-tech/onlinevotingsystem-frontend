package com.spring.onlinevoting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onlinevoting.entity.ElectionResult;
import com.spring.onlinevoting.entity.NominatedCandidates;
import com.spring.onlinevoting.exception.ResultNotFoundException;
import com.spring.onlinevoting.repo.ElectionResultRepository;
import com.spring.onlinevoting.repo.NominatedCandidatesRepository;

@Service
public class ElectionResultService {
	@Autowired
	ElectionResultRepository electionResultRepository;
	@Autowired
	NominatedCandidatesRepository nominatedCandidatesRepository;

	public ElectionResult createElectionResult(ElectionResult electionResult) {
		NominatedCandidates nominatedCandidates = electionResult.getCandidate();
		int resultId = nominatedCandidates.getCandidateId();
		if (resultId>0)
		{
			Optional<NominatedCandidates> resultContainer = nominatedCandidatesRepository.findById(resultId);
			if(resultContainer.isPresent())
			{
				electionResult.setCandidate(resultContainer.get());
			}
			else {
				throw new ResultNotFoundException("Result is not found");
			}
		}
		return electionResultRepository.save(electionResult);
		 
	}

	public List<ElectionResult> getelectionResults() {
		return electionResultRepository.findAll();
		
	}

	public boolean deleteElectionResult() {
		try {
			electionResultRepository.deleteAll();
		}
		catch(Exception e) {
			return true;
		}
		return false;
	}

	public ElectionResult updateElectionResult(int electionResultId, ElectionResult obj) {
		Optional<ElectionResult> resContainer = electionResultRepository.findById(electionResultId);
		if(resContainer.isPresent())
		{
			ElectionResult oldObj = resContainer.get();
			oldObj.setResult(obj.getResult());
			System.out.println("Succesfully updated!!!!");
			return electionResultRepository.saveAndFlush(oldObj);
		}
		else {
			System.out.println("Succesfully Inserted");
			return electionResultRepository.save(obj);
		}
	
	}

	

}
