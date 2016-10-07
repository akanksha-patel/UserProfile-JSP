package com.bitwise.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.models.EducationDetail;

@WebServlet("/EducationalDetailServlet")
public class EducationalDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EducationalDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String schoolName =  request.getParameter("schoolname");
		String tenth =  request.getParameter("tenth");
		String twelth =  request.getParameter("twelth");
		String  collegeName =  request.getParameter("collegename");
		String cgpa =  request.getParameter("cgpa");
		String[] favouriteSubject =  request.getParameterValues("subject");
		String action =  request.getParameter("submit");
		
		List<String> subjects = new ArrayList<>();
		if(favouriteSubject!=null){
			for(String sub : favouriteSubject){
				System.out.println(sub);
			subjects.add(sub);
			}
		}else{
			System.out.println("null return");
		}
		System.out.println("EducationDetail [schoolName=" + schoolName + ", tenth=" + tenth + ", twelth=" + twelth
				+ ", collegeName=" + collegeName + ", cgpa=" + cgpa + ", favouriteSubject=" + favouriteSubject);
	
		
		if(action.equals("Save and Next")){
		createProfile(session, schoolName, tenth, twelth, collegeName, cgpa, subjects);
		response.sendRedirect("profile.jsp");
		
		}
		
		if(action.equals("LogOut")){
			response.sendRedirect("ShowLogoutServlet");
		}
	
	}

	
	private void createProfile(HttpSession session, String schoolName, String tenth, String twelth, String collegeName,
			String cgpa, List<String> favouriteSubject) {
		// TODO Auto-generated method stub
		if(session!=null && session.getAttribute("educationalDetail")!=null){
		EducationDetail educationalDetail=(EducationDetail) session.getAttribute("educationalDetail");
		educationalDetail.setSchoolName(schoolName);
		educationalDetail.setTenth(tenth);
		educationalDetail.setTwelth(twelth);
		educationalDetail.setCollegeName(collegeName);
		educationalDetail.setCgpa(cgpa);
		educationalDetail.setFavouriteSubject(favouriteSubject);
		session.setAttribute("educationalDetail", educationalDetail);
		}else{
			EducationDetail educationalDetail = new EducationDetail(schoolName, tenth, twelth, collegeName, cgpa, favouriteSubject);
			session.setAttribute("educationalDetail", educationalDetail);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
