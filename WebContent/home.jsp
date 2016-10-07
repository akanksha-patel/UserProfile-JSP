<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="ex" uri="WEB-INF/custom.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/home.css" />
<link rel="stylesheet" type="text/css" href="css/footer.css" />
<title>Insert title here</title>
</head>
<body>
	<div id="main">
		<ul id="nav">
			<li><a href="personalDetail.jsp" id="profile">Profile</a></li>
			<li><a href="ShowLoginServlet">LogIn</a></li>


		</ul>
		<table id="info">
			<tr>
				<td><b>
				 <ex:Hello></ex:Hello>
						....... </b></td>
			</tr>
		</table>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>