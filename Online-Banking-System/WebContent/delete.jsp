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
	<form action="Deleteacc" method="post">
		<div align="center">
		<fieldset>
		<legend><b>Enter password again</b></legend>
		<b>Enter password </b><input type="password" size="20" name="pass"><br><br>
		<input type="submit" style="font-size:15px; width:40%; background-color:#6B8E23; color:white;" value="Delete account">
		</fieldset>
	</div>
	</form>
	<br><br>
	<form action="account.jsp">
	<div align="center">
		<fieldset>
		<legend><b>Back to Previous Screen</b></legend>
		<input type="submit" style="font-size:20px; width:30%; background-color:#6B8E23; color:white;" value="Back">
		</fieldset>
	</div>
	</form>
</body>
</html>



