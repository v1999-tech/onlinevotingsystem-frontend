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

import com.spring.onlinevoting.entity.RegisteredSocietyVoters;
import com.spring.onlinevoting.service.RegisteredSocietyVotersService;

@RestController
public class RegisteredSocietyVotersController {
	@Autowired
	RegisteredSocietyVotersService registeredSocietyVotersService;
	
	@PostMapping("/voters")
	public RegisteredSocietyVoters createRegisteredSocietyVoters(@Valid@RequestBody RegisteredSocietyVoters registeredSocietyVoters)
	{
		return registeredSocietyVotersService.createRegisteredSocietyVoters(registeredSocietyVoters);
	}
	
	@GetMapping("/voters")
	public List<RegisteredSocietyVoters> getRegisteredSocietyVoters(){
		return registeredSocietyVotersService.getRegisteredSocietyVoters();
	}
	
	@DeleteMapping("/voters")
	public boolean deleteRegisteredSocietyVoters() {
		return registeredSocietyVotersService.deleteRegisteredSocietyVoters();
		
	}
	
	@PutMapping("/voters/{voterId} ")
	public RegisteredSocietyVoters updateRegisteredSocietyVoters(@PathVariable int voterId, @RequestBody RegisteredSocietyVoters obj) {
		return registeredSocietyVotersService.updateRegisteredSocietyVoters(voterId, obj);
	}


}
