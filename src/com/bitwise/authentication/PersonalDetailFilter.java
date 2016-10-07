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
		System.out.println(dob);
		System.out.println("personal detail filter");

		if (!Validation.validateName(name)) {
			pw.print("<font size='3' color='red'>Invalid  name input </font>");
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (!Validation.validateName(fName)) {
			pw.print("<font size='3' color='red'>Invalid father name input </font>");
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (!Validation.validateName(mName)) {
			pw.print("<font size='3' color='red'>Invalid mother name input </font>");
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (gender == null) {
			pw.print("<font size='3' color='red'>Invalid gender input </font>");
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (hobbies == null) {
			pw.print("<font size='3' color='red'>Invalid hobbies input </font>");
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (!Validation.validateDob(dob)) {
			System.out.println("here");
			pw.print("<font size='3' color='red'>Invalid dob input </font>");
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (email == null || !Validation.validateEmail(email)) {
			pw.print("<font size='3' color='red'>Invalid email input </font>");
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (occupation == null) {
			pw.print("<font size='3' color='red'>Invalid occupation input </font>");
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else if (!Validation.validateName(nationality)) {
			pw.print("<font size='3' color='red'>Invalid nationality input </font>");
			req.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else {
			chain.doFilter(request, response);
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}