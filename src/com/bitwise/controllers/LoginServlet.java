package com.bitwise.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.models.User;
import com.bitwise.models.Users;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User user = new User(email, password);
		Users users = new Users();

		if (users.getUsers().contains(user)) {
			session.setAttribute("user", user);
			out.print("<font size='3' color='red'>");
			out.println("WELCOME "+email.toUpperCase());
			out.print("<font>");
			request.getRequestDispatcher("personalDetail.jsp").include(request, response);

		} else {
			request.setAttribute("msg", "INVALID CREDENTIALS !!!!!!");
			request.getRequestDispatcher("login.jsp").include(request, response);

		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
