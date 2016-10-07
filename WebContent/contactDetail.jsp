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

		<form action="ContactDetailServlet" method="get">
			<table id="contact_table">
				<caption id="cap">Contact Details</caption>
				<tr>
					<td>Address</td>
					<td class="cln">:</td>
					<td><textarea rows="3" cols="20" id="laddress" name="address"></textarea>
					</td>

				</tr>

				<tr>
					<td>Pincode</td>
					<td class="cln">:</td>
					<td><input type="text" id="lpincode" name="pincode" /></td>

				</tr>
				<tr>
					<td>City</td>
					<td class="cln">:</td>
					<td><select id="city" name="city">
							<option>Jabalpur</option>
							<option>Pune</option>
							<option>Bhopal</option>
							<option>Banglore</option>
					</select></td>
				</tr>
				<tr>
					<td>State</td>
					<td class="cln">:</td>
					<td><select id="state" name="state">
							<option>Madhya Pradesh</option>
							<option>Maharashtra</option>
							<option>Karnatka</option>
							<option>Uttar Pradesh</option>
					</select></td>
				</tr>
				<tr>
					<td>Country</td>
					<td class="cln">:</td>
					<td><select id="Country" name="country">
							<option>India</option>
							<option>U.K</option>
							<option>China</option>
							<option>Pakistan</option>
					</select></td>

				</tr>
				<tr>
					<td colspan="4">&nbsp;</td>
				</tr>

				<tr>
					<td>Landline</td>
					<td class="cln">:</td>
					<td><input type="text" id="plandline" name="landline" /></td>

				</tr>
				<tr>
					<td>Mobile</td>
					<td class="cln">:</td>
					<td><input type="text" id="lmobile" name="mobile" /></td>

				</tr>
				<tr>
					<td colspan="4">&nbsp;</td>
				</tr>
				<tr>

					<td colspan="2">&nbsp;</td>
					<td colspan="2"><input type="submit" name="submit"
						value="Back" /> <input type="submit" name="submit"
						value="Save and Next" /> <input type="submit" name="submit"
						value="LogOut" /></td>
				</tr>
			</table>
		</form>

	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>