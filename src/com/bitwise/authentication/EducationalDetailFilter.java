package com.bitwise.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class EducationalDetailFilter
 */
@WebFilter("/EducationalDetailServlet")
public class EducationalDetailFilter implements Filter {

    /**
     * Default constructor. 
     */
    public EducationalDetailFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String schoolName =  request.getParameter("schoolname");
		String tenth =  request.getParameter("tenth");
		String twelth =  request.getParameter("twelth");
		String  collegeName =  request.getParameter("collegename");
		String cgpa =  request.getParameter("cgpa");
		String[] favouriteSubject =  request.getParameterValues("subject");
		System.out.println("educational detail filter");
		
	
		

			if(schoolName.equals("")){
				pw.print("<font size='3' color='red'>Invalid schoolName input </font>");
				req.getRequestDispatcher("educationDetail.jsp").include(request, response);
				
			}else if(!Validation.validatePercentage(tenth)){
				pw.print("<font size='3' color='red'>Invalid tenth input </font>");
				req.getRequestDispatcher("educationDetail.jsp").include(request, response);
				
			}else if(!Validation.validatePercentage(twelth)){
				pw.print("<font size='3' color='red'>Invalid twelth input </font>");
				req.getRequestDispatcher("educationDetail.jsp").include(request, response);
				
			}
			else if(collegeName.equals("")){
				pw.print("<font size='3' color='red'>Invalid collegeName input </font>");
				req.getRequestDispatcher("educationDetail.jsp").include(request, response);
				
			}
			else if(!Validation.validatePercentage(cgpa)){
				pw.print("<font size='3' color='red'>Invalid cgpa input </font>");
				req.getRequestDispatcher("educationDetail.jsp").include(request, response);
				
			}
			else if(favouriteSubject == null ){
				pw.print("<font size='3' color='red'>Invalid favouriteSubject input </font>");
				req.getRequestDispatcher("educationDetail.jsp").include(request, response);
				
			}
			else {
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
