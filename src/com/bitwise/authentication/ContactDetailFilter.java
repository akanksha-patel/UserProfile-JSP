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

/**
 * Servlet Filter implementation class ContactDetailFilter
 */
@WebFilter("/ContactDetailServlet")
public class ContactDetailFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public ContactDetailFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String address = request.getParameter("address");
		String pincode = request.getParameter("pincode");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String landline = request.getParameter("landline");
		String mobile = request.getParameter("mobile");
		String msg = "";

		System.out.println("contact detail filter");

		if (address.equals("")) {
			msg = "Please enter your address";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("contactDetail.jsp").include(request, response);

		} else if (!Validation.validatePincode(pincode)) {
			msg = "Please enter a valid pincode of 6 digit";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("contactDetail.jsp").include(request, response);

		} else if (city == null) {
			msg = "Please enter your city";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("contactDetail.jsp").include(request, response);

		} else if (state == null) {
			msg = "Please enter your state";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("contactDetail.jsp").include(request, response);

		} else if (country == null) {
			msg = "Please enter your country";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("contactDetail.jsp").include(request, response);

		} else if (!Validation.validateLandline(landline)) {
			msg = "Please enter a valid 7 digit landline number";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("contactDetail.jsp").include(request, response);

		} else if (!Validation.validateMobile(mobile)) {
			msg = "Please enter a valid 10 digit mobile number";
			request.setAttribute("msg", msg);
			req.getRequestDispatcher("contactDetail.jsp").include(request, response);

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
