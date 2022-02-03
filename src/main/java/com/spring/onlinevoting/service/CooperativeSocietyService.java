package com.spring.onlinevoting.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onlinevoting.entity.CooperativeSociety;
import com.spring.onlinevoting.entity.RegisteredSocietyVoters;
import com.spring.onlinevoting.exception.VoterIdNotFoundException;
import com.spring.onlinevoting.exception.VoterListEmptyException;
import com.spring.onlinevoting.repo.CooperativeSocietyRepository;
import com.spring.onlinevoting.repo.RegisteredSocietyVotersRepository;

@Service
public class CooperativeSocietyService {
	@Autowired
	CooperativeSocietyRepository cooperativeSocietyRepository;
	@Autowired
	RegisteredSocietyVotersRepository registeredSocietyVotersRepository;

	public CooperativeSociety createCooperativeSociety(CooperativeSociety cooperativeSociety) throws VoterListEmptyException {
		List<RegisteredSocietyVoters> registerList = cooperativeSociety.getVoter();
		if(registerList.size()>0)
		{
			List<RegisteredSocietyVoters> newRegisterList = new ArrayList<>();
			for(int i=0;i<registerList.size();i++)
			{
				Optional<RegisteredSocietyVoters> registerContainer = registeredSocietyVotersRepository.findById(registerList.get(i).getVoterId());
				if(!(registerContainer.isPresent())) 
				{
					throw new VoterIdNotFoundException("VoterId is not found");
				}
				else
				{
					newRegisterList.add(registerContainer.get());
				}
			}
			cooperativeSociety.setVoter(newRegisterList);
		}
		else
		{
			throw new VoterListEmptyException("Voter List is Empty");
		}
		
		return cooperativeSocietyRepository.save(cooperativeSociety);
		
	}

	public List<CooperativeSociety> getCooperativeSocietys() {
		return cooperativeSocietyRepository.findAll();
	}

	public boolean deleteCooperativeSociety() {
		try {
			cooperativeSocietyRepository.deleteAll();
		}
		catch(Exception e) {
			return true;
		}
		return false;
	}

	public CooperativeSociety updateCooperativeSociety(int cooperativeSocietyId, CooperativeSociety obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
