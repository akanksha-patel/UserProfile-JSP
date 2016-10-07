<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/home.css" />
<link rel="stylesheet" type="text/css" href="css/footer.css" />
<title>Insert title here</title>
</head>
<body>

	<c:out value="${msg}"></c:out>

	<div id="main">
		<form action="LoginServlet" method="post">
			<table>
				<tr>
					<th colspan="3" id="title">LOGIN FORM</th>
				</tr>
				<tr>
					<td class="lbl">Email</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="email" name="email"
						class="txtfld" required></td>
				</tr>

				<tr>
					<td class="lbl">Password</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="password" name="password"
						class="txtfld" required></td>
				</tr>

				<tr>
					<td class="btn"><input type="submit" value="LOGIN"
						class="txtfld"></td>
				</tr>

				<tr>
					<td id="warn">*All Fields Are Mandatory</td>

				</tr>

			</table>
		</form>
	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>