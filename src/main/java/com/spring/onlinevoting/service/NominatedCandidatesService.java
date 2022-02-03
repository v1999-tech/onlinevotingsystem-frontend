package com.spring.onlinevoting.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onlinevoting.entity.CooperativeSociety;
import com.spring.onlinevoting.entity.NominatedCandidates;
import com.spring.onlinevoting.entity.RegisteredSocietyVoters;
import com.spring.onlinevoting.exception.SocietyIdNotFoundException;
import com.spring.onlinevoting.exception.SocietyListEmptyException;
import com.spring.onlinevoting.exception.VoterIdNotFoundException;
import com.spring.onlinevoting.exception.VoterListEmptyException;
import com.spring.onlinevoting.exception.VoterNotFoundException;
import com.spring.onlinevoting.repo.CooperativeSocietyRepository;
import com.spring.onlinevoting.repo.NominatedCandidatesRepository;
import com.spring.onlinevoting.repo.RegisteredSocietyVotersRepository;

@Service
public class NominatedCandidatesService {
	@Autowired
	NominatedCandidatesRepository nominatedCandidatesRepository;
	@Autowired
	RegisteredSocietyVotersRepository registeredSocietyVotersRepository;
	
	public NominatedCandidates createNominatedCandidates(NominatedCandidates nominatedCandidates) throws VoterListEmptyException {
		RegisteredSocietyVoters registeredSocietyVoters = nominatedCandidates.getVoter();
		int voterId = registeredSocietyVoters.getVoterId();
		if (voterId>0)
		{
			Optional<RegisteredSocietyVoters> voterContainer = registeredSocietyVotersRepository.findById(voterId);
			if(voterContainer.isPresent())
			{
				nominatedCandidates.setVoter(voterContainer.get());
			}
			else {
				throw new VoterNotFoundException("Voter is not found");
			}
		}
		return nominatedCandidatesRepository.save(nominatedCandidates);
	}
	
	public List<NominatedCandidates> getNominatedCandidates(){
		return nominatedCandidatesRepository.findAll();
	}

	public boolean deleteNominatedCandidates() {
		try {
			nominatedCandidatesRepository.deleteAll();
		}
		catch(Exception e) {
			return true;
		}
		return false;
	}

	public NominatedCandidates updateNominatedCandidates(int candidatesId, NominatedCandidates obj) {
		Optional<NominatedCandidates> registerContainer = nominatedCandidatesRepository.findById(candidatesId);
		if(registerContainer.isPresent())
		{
			NominatedCandidates oldObj = registerContainer.get();
			oldObj.setVoter(obj.getVoter());
			System.out.println("Succesfully updated!!!!");
			return nominatedCandidatesRepository.saveAndFlush(oldObj);
		}
		else
		{
			System.out.println("Succesfully Inserted");
			return nominatedCandidatesRepository.save(obj);
		}
		
	}

}
