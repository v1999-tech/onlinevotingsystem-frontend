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

import com.spring.onlinevoting.entity.CooperativeSociety;
import com.spring.onlinevoting.exception.VoterListEmptyException;
import com.spring.onlinevoting.service.CooperativeSocietyService;

@RestController
public class CooperativeSocietyController {
	@Autowired
	CooperativeSocietyService cooperativeSocietyService;
	
	@PostMapping("/societys")
	public CooperativeSociety
	createAdmin(@Valid@RequestBody CooperativeSociety cooperativeSociety) throws VoterListEmptyException
	{
		return cooperativeSocietyService.createCooperativeSociety(cooperativeSociety);
	}
	
	@GetMapping("/societys")
	public List<CooperativeSociety> getcooperativeSocietys(){
		return cooperativeSocietyService.getCooperativeSocietys();
	}
	
	@DeleteMapping("/societys")
	public boolean deleteCooperativeSociety( ) {
		return cooperativeSocietyService.deleteCooperativeSociety();
		
	}
	@PutMapping("/societys/{cooperativeSocietyId} ")
	public CooperativeSociety updateCooperativeSociety(@PathVariable int cooperativeSocietyId, @Valid@RequestBody CooperativeSociety obj) {
		return cooperativeSocietyService.updateCooperativeSociety(cooperativeSocietyId, obj);

	}

}
