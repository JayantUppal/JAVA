<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");	
	
		if(session.getAttribute("username")==null)
			response.sendRedirect("login.jsp");
	%>

<center>
<font color="black" size="5"><b>Welcome ${username}</b></font>
</center>
<br><br>
	<form action="Balance">
	<div align="center">
		<fieldset>
		<legend><b>View Balance</b></legend>
		<input type="submit" style="font-size:15px; width:50%; background-color:#6B8E23; color:white;" value="View Balance">
		</fieldset>
	</div>
	</form>
	<br><br>
	<form action="Deposit">
	<div align="center">
		<fieldset>
		<legend><b>Deposit Balance</b></legend>
		<b>Enter amount </b><input type="number" min="0" size="20" name="dmoney"><br><br>
		<input type="submit" style="font-size:15px; width:50%; background-color:#6B8E23; color:white;" value="Deposit Money">
		</fieldset>
	</div>
	</form>
	<br><br>
	<form action="Withdraw">
	<div align="center">
		<fieldset>
		<legend><b>Withdraw Balance</b></legend>
		<b>Enter amount </b><input type="number" min="0" size="20" name="wmoney"><br><br>
		<input type="submit" style="font-size:15px; width:50%; background-color:#6B8E23; color:white;" value="Withdraw Money">
		</fieldset>
	</div>
	</form>
	<br><br>
	<form action="delete.jsp">
	<div align="center">
		<fieldset>
		<legend><b>Delete Account</b></legend>
		<input type="submit" style="font-size:15px; width:50%; background-color:#6B8E23; color:white;" value="Delete account">
		</fieldset>
	</div>
	</form>
		<br><br>
	<form action="Logout">
	<div align="center">
		<fieldset>
		<legend><b>Log Out</b></legend>
		<input type="submit" style="font-size:15px; width:50%; background-color:#6B8E23; color:white;" value="Log Out">
		</fieldset>
	</div>
	</form>
</body>
</html>

