package com.spring.onlinevoting.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.onlinevoting.entity.VotedList;
import com.spring.onlinevoting.exception.VoterListEmptyException;
import com.spring.onlinevoting.service.VotedListService;

@RestController
public class VotedListController {
	@Autowired
	VotedListService votedListService;
	
	@PostMapping("/votedLists")
	public VotedList
	createVoter(@RequestBody VotedList votedList) throws VoterListEmptyException
	{
		return votedListService.createVotedList(votedList);
	}
	
	@GetMapping("/votedLists")
	public List<VotedList> getVotedLists(){
		return votedListService.getVotedLists();
	}
	
	@DeleteMapping("/votedLists")
	public boolean deleteVotedList() {
		return votedListService.deleteVotedList();
		
	}
/*
	@PutMapping("/users/{userId} ")
	public VotedList updateVotedList(@PathVariable int votedListId, @RequestBody VotedList obj) {
		return votedListService.updateVotedList(votedListId, obj);
	}
*/
}
