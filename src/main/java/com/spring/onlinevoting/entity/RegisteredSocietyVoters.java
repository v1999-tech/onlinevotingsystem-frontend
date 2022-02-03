package com.spring.onlinevoting.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="RegisteredSocietyVoters_TB")
public class RegisteredSocietyVoters {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="voter_Id")
	private int voterId;
	private String voterIdCardNo;
	private String firstName;
	private String lastName;
	private String gender;
	
	@NotNull(message= "password should not be null!!!")
	@Length(min=8,message ="password must contain 9 characters")
	@Pattern(regexp= "[A-Z]{4}[0-9]{3}[a-z]{1}[1-5]{1}", message = "password can only contain 9 characters!!!! ")
	private String password;
	
	private String reservationCategory;
	private String mobileno;
	
	@Email
	private String emailId;
	@NotNull
	private String address1;
	private String flatNo;
	boolean castedVote;
	public RegisteredSocietyVoters() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisteredSocietyVoters(int voterId, String voterIdCardNo, String firstName, String lastName, String gender,
			@NotNull(message = "password should not be null!!!") @Length(min = 8, message = "password must contain 9 characters") @Pattern(regexp = "[A-Z]{4}[0-9]{3}[a-z]{1}[1-5]{1}", message = "password can only contain 9 characters!!!! ") String password,
			String reservationCategory, String mobileno, @Email String emailId, @NotNull String address1, String flatNo,
			boolean castedVote) {
		super();
		this.voterId = voterId;
		this.voterIdCardNo = voterIdCardNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.password = password;
		this.reservationCategory = reservationCategory;
		this.mobileno = mobileno;
		this.emailId = emailId;
		this.address1 = address1;
		this.flatNo = flatNo;
		this.castedVote = castedVote;
	}
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getVoterIdCardNo() {
		return voterIdCardNo;
	}
	public void setVoterIdCardNo(String voterIdCardNo) {
		this.voterIdCardNo = voterIdCardNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReservationCategory() {
		return reservationCategory;
	}
	public void setReservationCategory(String reservationCategory) {
		this.reservationCategory = reservationCategory;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public boolean isCastedVote() {
		return castedVote;
	}
	public void setCastedVote(boolean castedVote) {
		this.castedVote = castedVote;
	}
	@Override
	public String toString() {
		return "RegisteredSocietyVoters [voterId=" + voterId + ", voterIdCardNo=" + voterIdCardNo + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender + ", password=" + password
				+ ", reservationCategory=" + reservationCategory + ", mobileno=" + mobileno + ", emailId=" + emailId
				+ ", address1=" + address1 + ", flatNo=" + flatNo + ", castedVote=" + castedVote + "]";
	}
	
	
	
	
}