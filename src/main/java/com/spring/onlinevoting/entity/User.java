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
@Table(name="User_TB")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_Id")
	private int userId;
	
	@NotNull(message= "password should not be null!!!")
	@Length(min=8,message ="password must contain 9 characters")
	@Pattern(regexp= "[A-Z]{4}[0-9]{3}[a-z]{1}[1-5]{1}", message = "password can only contain 9 characters!!!! ")
	private String password;
	
	@NotNull(message= "lastName should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", message = "Last name can only contain alphabets!!!!")
	private String lastName;
	
	@NotNull(message= "mobileno should not be null!!!")
	@Pattern(regexp= "^[0-9]{1}[0-9]{9}")
	private String mobileno;
	
	@NotNull(message= "emailId should not be null!!!")
	@Email
	private String emailId;
	
	public User() {
		super();
		
	}

	public User(int userId, String password, String lastName, String mobileno, String emailId) {
		super();
		this.userId = userId;
		this.password = password;
		this.lastName = lastName;
		this.mobileno = mobileno;
		this.emailId = emailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", lastName=" + lastName + ", mobileno=" + mobileno
				+ ", emailId=" + emailId + "]";
	}
	
	

}
