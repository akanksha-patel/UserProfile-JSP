<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:useBean id="contactDetail" class="com.bitwise.models.ContactDetail" scope="session"></jsp:useBean>
<jsp:useBean id="educationalDetail" class="com.bitwise.models.EducationDetail" scope="session"></jsp:useBean>
<jsp:useBean id="personalDetail" class="com.bitwise.models.PersonalDetail" scope="session"></jsp:useBean>

				<h1> YOUR DETAILS  </h1>
				

<h3>
FULL-NAME : <jsp:getProperty property="fullName" name="personalDetail"/><br>
FATHER'S NAME : <jsp:getProperty property="fatherName" name="personalDetail"/><br>
MOTHER'S NAME : <jsp:getProperty property="motherName" name="personalDetail"/><br>
GENDER : <jsp:getProperty property="gender" name="personalDetail"/><br>
DATE OF BIRTH : <jsp:getProperty property="dateOfBirth" name="personalDetail"/><br>
EMAIL ID : <jsp:getProperty property="emailId" name="personalDetail"/><br>
OCCUPATION : <jsp:getProperty property="occupation" name="personalDetail"/><br>
NATIONALITY : <jsp:getProperty property="nationality" name="personalDetail"/><br>
HOBBY : <jsp:getProperty property="hobby" name="personalDetail"/><br>


<br><br>

SCHOOL NAME : <jsp:getProperty property="schoolName" name="educationalDetail"/><br>
TENTH % : <jsp:getProperty property="tenth" name="educationalDetail"/><br>
TWELTH % : <jsp:getProperty property="twelth" name="educationalDetail"/><br>
COLLEGE NAME : <jsp:getProperty property="collegeName" name="educationalDetail"/><br>
CGPA : <jsp:getProperty property="cgpa" name="educationalDetail"/><br>
FAVOURITE SUBJECT : <jsp:getProperty property="favouriteSubject" name="educationalDetail"/><br>



<br><br>


ADDRESS : <jsp:getProperty property="address" name="contactDetail"/><br>
PINCODE : <jsp:getProperty property="pincode" name="contactDetail"/><br>
CITY : <jsp:getProperty property="city" name="contactDetail"/><br>
STATE : <jsp:getProperty property="state" name="contactDetail"/><br>
COUNTRY : <jsp:getProperty property="country" name="contactDetail"/><br>
MOBILE : <jsp:getProperty property="mobile" name="contactDetail"/><br>
LANDLINE : <jsp:getProperty property="landline" name="contactDetail"/><br>
</h3> 


<a href='ShowLogoutServlet'>LogOut</a>