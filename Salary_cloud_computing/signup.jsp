<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>

</head>
<body>

<div  >
<h1> Signup </h1>

<form action="signup" method="post" class="sform">
     Employ ID <br/><input name="employee_id"/> <br/><br/>
     First Name <br/> <input name="name"/> <br/><br/>
     Last Name <br/><input name="lname"/> <br/><br/>
     Password <br/><input name="password">  <br/><br/>
     Date of Birth <br/><input name="dob"> <small>DD-MM-YYYY</small>  <br/><br/>
     Contact <br/><input name="contact">  <br/><br/>
     <input type="submit">
     
</form>
</div>

</body>
</html>