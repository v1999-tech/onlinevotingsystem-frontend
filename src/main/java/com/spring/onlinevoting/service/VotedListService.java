package com.spring.onlinevoting.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onlinevoting.entity.RegisteredSocietyVoters;
import com.spring.onlinevoting.entity.VotedList;
import com.spring.onlinevoting.exception.VoterIdNotFoundException;
import com.spring.onlinevoting.exception.VoterListEmptyException;
import com.spring.onlinevoting.repo.RegisteredSocietyVotersRepository;
import com.spring.onlinevoting.repo.VotedListRepository;


@Service
public class VotedListService {
	@Autowired
	VotedListRepository votedListRepository;
	@Autowired
	RegisteredSocietyVotersRepository registeredSocietyVotersRepository;

	public VotedList createVotedList(VotedList votedList) throws VoterListEmptyException {
		List<RegisteredSocietyVoters> registerList = votedList.getVoter();
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
			votedList.setVoter(newRegisterList);
		}
		else
		{
			throw new VoterListEmptyException("Voter List is Empty");
		}
		
		return votedListRepository.save(votedList);
	}

	public List<VotedList> getVotedLists(){
    return votedListRepository.findAll();
	}

	public boolean deleteVotedList() {
		try {
			votedListRepository.deleteAll();
		}
		catch(Exception e) {
			return true;
		}
		return false;
	}
/*
	public VotedList updateVotedList(int votedListId, VotedList obj) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	
	
	

}
