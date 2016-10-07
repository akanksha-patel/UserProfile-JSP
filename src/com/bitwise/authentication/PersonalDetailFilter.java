package com.bitwise.authentication;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonalDetailFilter implements Filter {

	public PersonalDetailFilter() {

	}

	public void destroy() {

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String name = request.getParameter("name");
		String fName = request.getParameter("fname");
		String mName = request.getParameter("mname");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String occupation = request.getParameter("occupation");
		String nationality = request.getParameter("nationality");
		String msg = "";
		System.out.println(dob);
		System.out.println("personal detail filter");

		if (!Validation.validateName(name)) {
			msg= "Name should not contain letters or special symbol ";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (!Validation.validateName(fName)) {
			msg= "Father's name should not contain letters or special symbol ";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (!Validation.validateName(mName)) {
			msg= "Mother's name should not contain letters or special symbol ";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (gender == null) {
			msg= "Please select your gender ";
			
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (hobbies == null) {
			msg= "Please select your hobbies ";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (!Validation.validateDob(dob)) {
			System.out.println("here");
			msg= "Date of birth is invalid ";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (email == null || !Validation.validateEmail(email)) {
			msg= "Invalid email address ";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (occupation == null) {
			msg= "Please select your ocuupation ";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (!Validation.validateName(nationality)) {
			msg= "Please enter a valid country ";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} 
		else {
			chain.doFilter(request, response);
		}
		
		request.setAttribute("msg", msg);

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}