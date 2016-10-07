package com.bitwise.controllers;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.models.PersonalDetail;

@WebServlet("/PersonalDetailServlet")
public class PersonalDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PersonalDetailServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("personal detail servlet");
		Date dob = null;
		String name = request.getParameter("name");
		String fName = request.getParameter("fname");
		String mName = request.getParameter("mname");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies");

		dob = Date.valueOf(request.getParameter("dob"));

		String email = request.getParameter("email");
		String occupation = request.getParameter("occupation");
		String nationality = request.getParameter("nationality");
		List<String> hobby = new ArrayList<String>();
		HttpSession session = request.getSession(false);
		String action = request.getParameter("submit");

		for (String userhobby : hobbies) {
			hobby.add(userhobby);

		}

		if (action.equals("Save and Next")) {
			createProfile(session, name, fName, mName, gender, hobby, dob, email, occupation, nationality);
			response.sendRedirect("contactDetail.jsp");

		}

		if (action.equals("LogOut")) {
			response.sendRedirect("ShowLogoutServlet");
		}
	}

	private void createProfile(HttpSession session, String name, String fName, String mName, String gender,
			List<String> hobby, Date dob, String email, String occupation, String nationality) {

		if (session != null && session.getAttribute("personalDetail") != null) {
			PersonalDetail personalDetail = (PersonalDetail) session.getAttribute("personalDetail");
			personalDetail.setFullName(name);
			personalDetail.setFatherName(fName);
			personalDetail.setMotherName(mName);
			personalDetail.setGender(gender);
			personalDetail.setDateOfBirth(dob);
			personalDetail.setEmailId(email);
			personalDetail.setOccupation(occupation);
			personalDetail.setNationality(nationality);
			session.setAttribute("personalDetail", personalDetail);

		} else {
			PersonalDetail personalDetail = new PersonalDetail(name, fName, mName, gender, hobby, dob, email,
					occupation, nationality);
			session.setAttribute("personalDetail", personalDetail);
		}

	}

}