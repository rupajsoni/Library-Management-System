<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<div id="header" align="center">
<table style="width:100%;">
<tr>
<td width="10%">
</td>
<td width="90%">
<h1>Online Product Management</h1>
</td>
</tr>
</table>

</div>

<div id="content" align="center">
<br><br><br>
<form id="f1" action="Student_Login_Servlet" method="post">
<table style="width:30%;">
<tr>
<td>
Username
</td>
<td>
<input type="text" name="username">
</td>
</tr>
<tr>
<td>
Password
</td>
<td>
<input type="password" name="userpass">
</td>
</tr>
<tr>
<td>
</td>
<td>
<input type="submit" name="submit" value="Login">
</td>
</tr>

</table>
</form>
<br><br><br>

</div>

<div id="footer" align="center">
copyright@LGID&nbsp;886981&nbsp;Aditya
</div>

</body>
</html>