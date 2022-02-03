package com.spring.onlinevoting.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="ElectionOfficer_TB")
public class ElectionOfficer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="officer_Id")
	private int officerId;
	
	@NotNull(message= "First name should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", message = "First name can only contain alphabets!!!!")
	private String firstName;
	
	@NotNull(message= "Last name should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", message = "Last name can only contain alphabets!!!!")
	private String lastName;
	
	@NotNull(message= "password should not be null!!!")
	@Length(min=8,message ="password must contain 9 characters")
	@Pattern(regexp= "[A-Z]{4}[0-9]{3}[a-z]{1}[1-5]{1}", message = "password can only contain 9 characters!!!! ")
	private String password;
	
	private String gender;
	
	@NotNull(message= "mobileno should not be null!!!")
	@Pattern(regexp= "^[0-9]{1}[0-9]{9}",message= "mobileno should be of 10 digits")
	private String mobileno;
	
	@Email(message= "EmailId should not be null!!!")
	private String emailId;
	private String address1;
	private String flatNo;
	
	public ElectionOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectionOfficer(int officerId,
			@NotNull(message = "First name should not be null!!!") @Pattern(regexp = "^[A-Za-z]+$", message = "First name can only contain alphabets!!!!") String firstName,
			@NotNull(message = "Last name should not be null!!!") @Pattern(regexp = "^[A-Za-z]+$", message = "Last name can only contain alphabets!!!!") String lastName,
			@NotNull(message = "password should not be null!!!") @Length(min = 8, message = "password must contain 9 characters") @Pattern(regexp = "[A-Z]{4}[0-9]{3}[a-z]{1}[1-5]{1}", message = "password can only contain 9 characters!!!! ") String password,
			String gender,
			@NotNull(message = "mobileno should not be null!!!") @Pattern(regexp = "^[0-9]{1}[0-9]{9}", message = "mobileno should be of 10 digits") String mobileno,
			@Email(message = "EmailId should not be null!!!") String emailId, String address1, String flatNo) {
		super();
		this.officerId = officerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.gender = gender;
		this.mobileno = mobileno;
		this.emailId = emailId;
		this.address1 = address1;
		this.flatNo = flatNo;
	}

	public int getOfficerId() {
		return officerId;
	}

	public void setOfficerId(int officerId) {
		this.officerId = officerId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "ElectionOfficer [officerId=" + officerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", gender=" + gender + ", mobileno=" + mobileno + ", emailId=" + emailId
				+ ", address1=" + address1 + ", flatNo=" + flatNo + "]";
	}

}
