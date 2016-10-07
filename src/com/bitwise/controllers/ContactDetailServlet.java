package com.bitwise.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.models.ContactDetail;

@WebServlet("/ContactDetailServlet")
public class ContactDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String address= request.getParameter("address");
		String pincode =request.getParameter("pincode");
		String city =request.getParameter("city");
		String state =request.getParameter("state");
		String country = request.getParameter("country");
		String landline =request.getParameter("landline");
		String mobile =request.getParameter("mobile");
		String action = request.getParameter("submit");
		
		if(action.equals("Save and Next")){
		createContact(session, address, pincode	, city, state, country, landline, mobile);
		response.sendRedirect("educationDetail.jsp");
		}else if(action.equals("LogOut")){
			response.sendRedirect("ShowLogoutServlet");
		}else{
			response.sendRedirect("personalDetail.jsp");
		}
		
	}
	
	private void createContact(HttpSession session, String address, String pincode, String city, String state,
			String country, String landline, String mobile) {
		// TODO Auto-generated method stub
		if(session!=null && session.getAttribute("contactDetail")!=null){
			System.out.println("there");
			ContactDetail contactDetail = (ContactDetail)session.getAttribute("contactDetail");
			contactDetail.setAddress(address);
			contactDetail.setCity(city);
			contactDetail.setCountry(country);
			contactDetail.setLandline(landline);
			contactDetail.setMobile(mobile);
			contactDetail.setPincode(pincode);
			contactDetail.setState(state);
			session.setAttribute("contactDetail", contactDetail);
			
		}else{
			
			ContactDetail contactDetail = new ContactDetail(address, pincode, city, state, country, mobile, landline);
			session.setAttribute("contactDetail", contactDetail);
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}