package com.spring.onlinevoting.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="ElectionResult_TB")
public class ElectionResult {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ElectionResultId_Id")
	private int resultId;
	Date pollingDate;
	@OneToOne
	@JoinColumn(name="candidate_Id")
	private NominatedCandidates candidate;
	private String coop_SocietyName;
	private int totalSocietyVotes;
	private int totalPolledVotes;
	private float totalPollingPercentage;
	private int totalCandidateVotes;
	private float candidateVotesPercentage;
	private String result;
	public ElectionResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectionResult(int resultId, Date pollingDate, NominatedCandidates candidate, String coop_SocietyName,
			int totalSocietyVotes, int totalPolledVotes, float totalPollingPercentage, int totalCandidateVotes,
			float candidateVotesPercentage, String result) {
		super();
		this.resultId = resultId;
		this.pollingDate = pollingDate;
		this.candidate = candidate;
		this.coop_SocietyName = coop_SocietyName;
		this.totalSocietyVotes = totalSocietyVotes;
		this.totalPolledVotes = totalPolledVotes;
		this.totalPollingPercentage = totalPollingPercentage;
		this.totalCandidateVotes = totalCandidateVotes;
		this.candidateVotesPercentage = candidateVotesPercentage;
		this.result = result;
	}
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public Date getPollingDate() {
		return pollingDate;
	}
	public void setPollingDate(Date pollingDate) {
		this.pollingDate = pollingDate;
	}
	public NominatedCandidates getCandidate() {
		return candidate;
	}
	public void setCandidate(NominatedCandidates candidate) {
		this.candidate = candidate;
	}
	public String getCoop_SocietyName() {
		return coop_SocietyName;
	}
	public void setCoop_SocietyName(String coop_SocietyName) {
		this.coop_SocietyName = coop_SocietyName;
	}
	public int getTotalSocietyVotes() {
		return totalSocietyVotes;
	}
	public void setTotalSocietyVotes(int totalSocietyVotes) {
		this.totalSocietyVotes = totalSocietyVotes;
	}
	public int getTotalPolledVotes() {
		return totalPolledVotes;
	}
	public void setTotalPolledVotes(int totalPolledVotes) {
		this.totalPolledVotes = totalPolledVotes;
	}
	public float getTotalPollingPercentage() {
		return totalPollingPercentage;
	}
	public void setTotalPollingPercentage(float totalPollingPercentage) {
		this.totalPollingPercentage = totalPollingPercentage;
	}
	public int getTotalCandidateVotes() {
		return totalCandidateVotes;
	}
	public void setTotalCandidateVotes(int totalCandidateVotes) {
		this.totalCandidateVotes = totalCandidateVotes;
	}
	public float getCandidateVotesPercentage() {
		return candidateVotesPercentage;
	}
	public void setCandidateVotesPercentage(float candidateVotesPercentage) {
		this.candidateVotesPercentage = candidateVotesPercentage;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "ElectionResult [resultId=" + resultId + ", pollingDate=" + pollingDate + ", candidate=" + candidate
				+ ", coop_SocietyName=" + coop_SocietyName + ", totalSocietyVotes=" + totalSocietyVotes
				+ ", totalPolledVotes=" + totalPolledVotes + ", totalPollingPercentage=" + totalPollingPercentage
				+ ", totalCandidateVotes=" + totalCandidateVotes + ", candidateVotesPercentage="
				+ candidateVotesPercentage + ", result=" + result + "]";
	}
	
	
	
	
	
}