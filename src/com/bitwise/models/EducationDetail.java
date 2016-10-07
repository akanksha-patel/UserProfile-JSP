package com.bitwise.models;

import java.util.ArrayList;
import java.util.List;

public class EducationDetail {

	private String schoolName;
	private String tenth;
	private String twelth;
	private String collegeName;
	private String cgpa;
	private List<String> favouriteSubject = new ArrayList<String>();

	@Override
	public String toString() {
		return "EducationDetail [schoolName=" + schoolName + ", tenth=" + tenth + ", twelth=" + twelth
				+ ", collegeName=" + collegeName + ", cgpa=" + cgpa + ", favouriteSubject=" + favouriteSubject + "]";
	}

	public EducationDetail(String schoolName, String tenth, String twelth, String collegeName, String cgpa,
			List<String> favouriteSubject) {
		super();
		this.schoolName = schoolName;
		this.tenth = tenth;
		this.twelth = twelth;
		this.collegeName = collegeName;
		this.cgpa = cgpa;
		this.favouriteSubject = favouriteSubject;
	}

	public EducationDetail() {
	}

	public String getTenth() {
		return tenth;
	}

	public void setTenth(String tenth) {
		this.tenth = tenth;
	}

	public String getTwelth() {
		return twelth;
	}

	public void setTwelth(String twelth) {
		this.twelth = twelth;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	

	public List<String> getFavouriteSubject() {
		return favouriteSubject;
	}

	public void setFavouriteSubject(List<String> favouriteSubject) {
		this.favouriteSubject = favouriteSubject;
	}


}
