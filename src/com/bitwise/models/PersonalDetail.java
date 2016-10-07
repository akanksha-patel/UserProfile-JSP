package com.bitwise.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonalDetail {
	
	private String fullName;
	private String fatherName;
	private String motherName;
	private String gender;
	private Date dateOfBirth;
	private String emailId;
	private String occupation;
	private String nationality;
	private List<String> hobby = new ArrayList<String>();
	
	
	
	public PersonalDetail() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "PersonalDetail [fullName=" + fullName + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", emailId=" + emailId + ", occupation="
				+ occupation + ", nationality=" + nationality + ", hobby=" + hobby + "]";
	}



	public PersonalDetail(String fullName, String fatherName, String motherName, String gender, List<String> hobby ,Date dateOfBirth,
			String emailId, String occupation, String nationality) {
		super();
		this.fullName = fullName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.gender = gender;
		this.setHobby(hobby);
		this.dateOfBirth = dateOfBirth;
		this.emailId = emailId;
		this.occupation = occupation;
		this.nationality = nationality;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

}