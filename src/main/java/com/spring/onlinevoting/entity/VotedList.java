package com.spring.onlinevoting.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="VotedList_TB")
public class VotedList {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VotedList_Id")
	private int votedListId;
	
	Date pollingDateTime;
	@OneToMany(cascade=CascadeType.ALL) 
	//@JoinColumn(name="voter_Id")
	private List<RegisteredSocietyVoters> voter;
	@OneToOne
	@JoinColumn(name="candidate_Id")
	private NominatedCandidates candidate;
	
	public VotedList() {
		super();
		
	}

	public VotedList(int votedListId, Date pollingDateTime, List<RegisteredSocietyVoters> voter,
			NominatedCandidates candidate) {
		super();
		this.votedListId = votedListId;
		this.pollingDateTime = pollingDateTime;
		this.voter = voter;
		this.candidate = candidate;
	}

	public int getVotedListId() {
		return votedListId;
	}

	public void setVotedListId(int votedListId) {
		this.votedListId = votedListId;
	}

	public Date getPollingDateTime() {
		return pollingDateTime;
	}

	public void setPollingDateTime(Date pollingDateTime) {
		this.pollingDateTime = pollingDateTime;
	}

	public List<RegisteredSocietyVoters> getVoter() {
		return voter;
	}

	public void setVoter(List<RegisteredSocietyVoters> voter) {
		this.voter = voter;
	}

	public NominatedCandidates getCandidate() {
		return candidate;
	}

	public void setCandidate(NominatedCandidates candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "VotedList [votedListId=" + votedListId + ", pollingDateTime=" + pollingDateTime + ", voter=" + voter
				+ ", candidate=" + candidate + "]";
	}

	
	
}
