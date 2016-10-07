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
	<div id="main">


		<form action="PersonalDetailServlet">
			<table>
				<tr>
					<th>Fill Your Personal Details</th>
				</tr>
				<tr>
					<td>Full Name</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Father's Name</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="text" name="fname"></td>
				</tr>
				<tr>
					<td>Mother's Name</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="text" name="mname"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td class="cln">:</td>
					<td class="txtfldtd">Female <input type="radio" name="gender"
						value="Female"></td>
					<td class="txtfldtd">Male <input type="radio" name="gender"
						value="Male"></td>
				</tr>
				<tr>
					<td>Hobbies :</td>
					<td class="cln">:</td>
					<td class="txtfldtd">Reading <input type="checkbox"
						name="hobbies" value="reading"></td>
					<td class="txtfldtd">Writing <input type="checkbox"
						name="hobbies" value="writing"></td>
					<td class="txtfldtd">Swimming <input type="checkbox"
						name="hobbies" value="swimming"></td>
					<td class="txtfldtd">Studying <input type="checkbox"
						name="hobbies" value="studying"></td>
					<td class="txtfldtd">Sketching <input type="checkbox"
						name="hobbies" value="sketching"></td>
					<td class="txtfldtd">Others <input type="checkbox"
						name="hobbies" value="others"></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="date"
						data-date-inline-picker="false" name="dob" placeholder="YYYY-MM-DD" /></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Occupation</td>
					<td class="cln">:</td>
					<td><select name="occupation">
							<option>Student</option>
							<option>Employee</option>
							<option>Entrepreneur</option>
							<option>Business Person</option>
							<option>Graduate</option>
							<option>Post Graduate</option>
							<option>Other</option>
					</select>
				</tr>
				<tr>
					<td>Nationality</td>
					<td class="cln">:</td>
					<td class="txtfldtd"><input type="text" name="nationality"></td>
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