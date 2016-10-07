package com.bitwise.customTags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class DescriptionTag extends SimpleTagSupport{

	public void doTag() throws JspException,IOException{
		JspWriter out = getJspContext().getOut();
		out.println("  A COMMON BACKGROUND TO ALL THE USERS TO CREATE "
				+ "PROFILE AT ANY LOCATION IN WORLD");
	}
	
	
	
	
}
