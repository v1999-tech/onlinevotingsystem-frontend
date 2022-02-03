package com.spring.onlinevoting.entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="NominatedCandidates_TB")
public class NominatedCandidates {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="candidate_Id")
	private int candidateId;
	private String nominationFormNo;
	@OneToOne
	private RegisteredSocietyVoters voter;
	
	public NominatedCandidates() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NominatedCandidates(int candidateId, String nominationFormNo, RegisteredSocietyVoters voter) {
		super();
		this.candidateId = candidateId;
		this.nominationFormNo = nominationFormNo;
		this.voter = voter;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getNominationFormNo() {
		return nominationFormNo;
	}

	public void setNominationFormNo(String nominationFormNo) {
		this.nominationFormNo = nominationFormNo;
	}

	public RegisteredSocietyVoters getVoter() {
		return voter;
	}

	public void setVoter(RegisteredSocietyVoters voter) {
		this.voter = voter;
	}

	@Override
	public String toString() {
		return "NominatedCandidates [candidateId=" + candidateId + ", nominationFormNo=" + nominationFormNo + ", voter="
				+ voter + "]";
	}
	
	
	
	
}
