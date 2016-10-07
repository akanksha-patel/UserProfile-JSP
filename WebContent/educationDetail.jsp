<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/home.css" />
<link rel="stylesheet" type="text/css" href="css/footer.css" />
<title>Insert title here</title>
</head>
<body>
	<div id="msg">${msg}</div>
	<div id="main">

		<form action="EducationalDetailServlet">
			<table>
				<tr>
					<th>Fill Your Educational Details</th>
				</tr>
				<tr>
					<td>School Name</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="text" name="schoolname"></td>
				</tr>
				<tr>
					<td>10th percentage</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="text" name="tenth"></td>
				</tr>
				<tr>
					<td>12th percentage</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="text" name="twelth"></td>
				</tr>
				<tr>
					<td>College Name</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="text" name=collegename></td>

				</tr>

				<tr>
					<td>CGPA</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="text" name="cgpa"></td>
				</tr>

				<tr>
					<td>Favourite Subject</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="checkbox" value="dbms"
						name="subject"> DataBaseManagement System</td>
					<td class="txtfldtd"><input type="checkbox" value="sepm"
						name="subject"> Software Engineering</td>
					<td class="txtfldtd"><input type="checkbox" value="java"
						name="subject"> Java</td>
					<td class="txtfldtd"><input type="checkbox" value="oracle"
						name="subject"> Oracle</td>
				</tr>
				<tr>

					<td colspan="2">&nbsp;</td>
					<td colspan="2"><input type="submit" name="submit"
						value="Save and Next" /> <input type="submit" value="LogOut"
						name="submit" /></td>
				</tr>

			</table>
		</form>

	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>