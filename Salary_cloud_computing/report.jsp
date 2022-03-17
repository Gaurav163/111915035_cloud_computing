<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Search</h1>
<form action="report">
Employ ID <br/><input name="userid"/> <br/><br/>
<input type="submit">
</form>
<br/>

<h3> Details of user :${user.getFirst_Name()}</h3>
Employee ID : ${user.getEmployee_ID_Number()}<br/><br/>
First Name : ${user.getFirst_Name()}<br/><br/>
Last  Name : ${user.getLast_Name()}<br/><br/>
Date of Birth  : ${user.getDate_of_Birth()}<br/><br/>
Contact Number : ${user.getContact_Number()}<br/><br/>
Job Role : ${user.getJob()}<br/><br/>
Monthly Salary : ${user.getSalary()}<br/><br/>
Annual Bonus : ${user.getBonus()}<br/><br/>
Total Year Salary : ${ user.getYearSalary()}<br/><br/>


</body>
</html>