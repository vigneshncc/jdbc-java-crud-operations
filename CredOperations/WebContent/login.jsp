<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="login" method="post" action="RegServlet">
<input type="hidden" name="pagename" value="login"/>
<table>
	<tr>
		<td>User Name</td>
		<td><input type="text" name="txtUserName"/></td>
	</tr>
		<tr>
		<td>Password</td>
		<td><input type="password" name="txtPassword"/></td>
	</tr>
		<tr>
		<td><button type="submit">Login</button></td>
		<td><label>Register</label></td>
	</tr>
</table>
</form>
</body>
</html>