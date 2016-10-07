package com.bitwise.models;

public class ContactDetail {
	private String address;
	private String pincode;
	private String city;
	private String state;
	private String country;
	private String mobile;
	private String landline;
	
	
	
	public ContactDetail() {
		super();
	}
	
	public ContactDetail(String address, String pincode, String city, String state, String country, 
			String mobile, String landline) {
		super();
		this.address = address;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobile = mobile;
		this.landline = landline;
	}
	
	
	
	
	@Override
	public String toString() {
		return "ContactDetail [address=" + address + ", pincode=" + pincode + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", email=" + ", mobile=" + mobile + ", landline=" + landline + "]";
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	
}