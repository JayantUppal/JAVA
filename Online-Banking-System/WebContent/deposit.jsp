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

<br>

	<form action="account.jsp">
	<div align="center">
		<fieldset>
		<legend><b>Current Balance</b></legend>		
		<font color="black" size="5"><b>Rs. ${ubal}</b></font><br>
		<input type="submit" style="font-size:20px; width:30%; background-color:#6B8E23; color:white;" value="Back">
		</fieldset>
	</div>
	</form>
</body>
</html>



