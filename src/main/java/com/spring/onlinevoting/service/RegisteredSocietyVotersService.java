package com.spring.onlinevoting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onlinevoting.entity.CooperativeSociety;
import com.spring.onlinevoting.entity.RegisteredSocietyVoters;
import com.spring.onlinevoting.exception.SocietyNotFoundException;
import com.spring.onlinevoting.repo.CooperativeSocietyRepository;
import com.spring.onlinevoting.repo.RegisteredSocietyVotersRepository;

@Service
public class RegisteredSocietyVotersService {
	@Autowired
	RegisteredSocietyVotersRepository registeredSocietyVotersRepository;
	@Autowired
	CooperativeSocietyRepository cooperativeSocietyRepository;
	
	public RegisteredSocietyVoters createRegisteredSocietyVoters(RegisteredSocietyVoters registeredSocietyVoters){
		/*CooperativeSociety cooperativeSociety = registeredSocietyVoters.getSociety();
		int societyId = cooperativeSociety.getSocietyId();
		if (societyId>0)
		{
			Optional<CooperativeSociety> societyContainer = cooperativeSocietyRepository.findById(societyId);
			if(societyContainer.isPresent())
			{
				registeredSocietyVoters.setSociety(societyContainer.get());
			}
			else {
				throw new SocietyNotFoundException("Society is not found");
			}
		}*/
		return registeredSocietyVotersRepository.save(registeredSocietyVoters);
	}
	
	public List<RegisteredSocietyVoters> getRegisteredSocietyVoters(){
		return registeredSocietyVotersRepository.findAll();
	}

	public boolean deleteRegisteredSocietyVoters() {
		try {
			registeredSocietyVotersRepository.deleteAll();
		}
		catch(Exception e) {
			return true;
		}
		return false;
	}
	
	public RegisteredSocietyVoters updateRegisteredSocietyVoters(int registeredSocietyVotersId, RegisteredSocietyVoters obj) {
		Optional<RegisteredSocietyVoters> societyCon = registeredSocietyVotersRepository.findById(registeredSocietyVotersId);
		if(societyCon.isPresent())
		{
			RegisteredSocietyVoters oldObj = societyCon.get();
			oldObj.setEmailId(obj.getEmailId());
			System.out.println("Successfully updated!!!!");
			return registeredSocietyVotersRepository.saveAndFlush(oldObj);
		}
		else {
			System.out.println("Successfully inserted");
			return registeredSocietyVotersRepository.save(obj);
		}
		
		
	}

}
