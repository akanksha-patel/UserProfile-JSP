package com.bitwise.authentication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {

	public static boolean validateEmail(String email) {
		String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(emailPattern);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean validateMobile(String mobile) {
		return mobile.matches("^[789]\\d{9}$");
	}
	public static boolean validateLandline(String landline) {
		return landline.matches("^\\d{7}$");
	}

	public static boolean validateName(String str) {
		boolean b = str.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
		System.out.println(b);
		return b;
	}

	public static boolean validatePassword(String password) {
		return password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
	}

	public static boolean validatePincode(String pincode) {
		return pincode.matches("^[1-9][0-9]{5}$");
	}
	
	public static boolean validateDob(String dob) {
		System.out.println("opss");
		return dob.matches("\\d{4}-\\d{2}-\\d{2}");
	}
	
	public static boolean validatePercentage(String dob) {
		return dob.matches("^\\d+([.]\\d+)?%?$");
	}


	}
