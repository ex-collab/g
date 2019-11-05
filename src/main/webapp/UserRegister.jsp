<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="index.html"></jsp:include>

<form action="UserRegister" name="User Form" method="post">
<center>
<table>
<tr>
<th> User id:</th>
<td> <input type="text" placeholder="User ID" name='eid' id="eid"></input>
</td></tr>
<tr>
<th> First Name:</th>
<td> <input type="text" placeholder="First Name" name='fname' id="fname"></input>
</td></tr>
<tr>
<th> Last Name:</th>
<td> <input type="text" placeholder="Last Name" name='lname' id="lname"></input>
</td></tr>
<tr>
<th> Date of Joining:</th>
<td> <input type="text" placeholder="DD/MM/YYYY"  name='doj' id='doj'></input>
</td></tr>
<tr>
<th> Department:</th>
<td> <input type="text" placeholder="Department Name"  name='dept' id='dept'></input>
</td></tr>

<tr>
<th colspan="2">
<input type="submit"  value='Register User'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value='Clear'>
</th></tr>
</table>                     
</center>
</form>

</body>
</html>