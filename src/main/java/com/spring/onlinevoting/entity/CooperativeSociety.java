package com.spring.onlinevoting.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="CooperativeSociety_TB")
public class CooperativeSociety {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="society_Id")
	private int societyId;
	
	@NotNull(message= "Name should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", message = "Society name can only contain alphabets!!!!")
	private String societyName;
	
	@NotNull(message= "Head of Society should not be null!!!")
	private String headOfSociety;
	
	@NotNull(message= "Village should not be null!!!")
	private String village;
	
	@NotNull(message= "Mandal should not be null!!!")
	private String mandal;
	
	@NotNull(message= "District should not be null!!!")
	private String district;
	
	@Pattern(regexp= "^[0-9]{6}",message= "Pin Code should not be more than 6 digitss!!!")
	private String pincode;
	
	@OneToMany(cascade=CascadeType.ALL) 
	//@JoinColumn(name="voter_Id")
	private List<RegisteredSocietyVoters> voter;

	public CooperativeSociety() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CooperativeSociety(int societyId,
			@NotNull(message = "Name should not be null!!!") @Pattern(regexp = "^[A-Za-z]+$", message = "Society name can only contain alphabets!!!!") String societyName,
			@NotNull(message = "Head of Society should not be null!!!") String headOfSociety,
			@NotNull(message = "Village should not be null!!!") String village,
			@NotNull(message = "Mandal should not be null!!!") String mandal,
			@NotNull(message = "District should not be null!!!") String district,
			@Pattern(regexp = "^[0-9]{6}", message = "Pin Code should not be more than 6 digitss!!!") String pincode,
			List<RegisteredSocietyVoters> voter) {
		super();
		this.societyId = societyId;
		this.societyName = societyName;
		this.headOfSociety = headOfSociety;
		this.village = village;
		this.mandal = mandal;
		this.district = district;
		this.pincode = pincode;
		this.voter = voter;
	}

	public int getSocietyId() {
		return societyId;
	}

	public void setSocietyId(int societyId) {
		this.societyId = societyId;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getHeadOfSociety() {
		return headOfSociety;
	}

	public void setHeadOfSociety(String headOfSociety) {
		this.headOfSociety = headOfSociety;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<RegisteredSocietyVoters> getVoter() {
		return voter;
	}

	public void setVoter(List<RegisteredSocietyVoters> voter) {
		this.voter = voter;
	}

	@Override
	public String toString() {
		return "CooperativeSociety [societyId=" + societyId + ", societyName=" + societyName + ", headOfSociety="
				+ headOfSociety + ", village=" + village + ", mandal=" + mandal + ", district=" + district
				+ ", pincode=" + pincode + ", voter=" + voter + "]";
	}
	
	
}
