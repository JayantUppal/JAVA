<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank of Spain</title>
<style>
body{
	background:url(https://images.unsplash.com/photo-1501167786227-4cba60f6d58f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80)no-repeat center center fixed;
	background-size: cover;
}
legend {
  padding: 6px;
  background-color:white;
}
fieldset {
	background-color:white;
	width:30%;
}
</style>
</head>

<body>
<br>
<center>
<font color="black" size="10"><b>Welcome to Bank of Spain</b></font>
</center>
<br><br>
	<form action="Login" method="post">
	<div align="center">
		<fieldset>
		<legend><b>Existing user</b></legend>
		<b>Enter username  </b><input type="text" size="20" name="uname"><br><br>
		<b>Enter password  </b><input type="password" size="20" name="pass"><br><br>
		<input type="submit" style="font-size:20px; width:30%; background-color:#6B8E23; color:white;" value="Login">
		</fieldset>
	</div>
	</form>
	
	<br><br><br>

	<form action="enterdetails.jsp">
	<div align="center">
		<fieldset>
			<legend><b>New user</b></legend>
			<input type="submit" style="font-size:20px; width:30%; background-color:#6B8E23; color:white;" value="Sign Up">
		</fieldset>
	</div>
	</form>
</body>
</html>


