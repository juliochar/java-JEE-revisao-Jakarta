<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--  1- HTML FORM + 2 HTML URL (a href) -->
	<form action="testRequest" method = "POST">
	<input type="text" name="userName" id="userName"/>
	
	<select name="country">
		<option>USA</option>
		<option>MEXICO</option>
		<option>CANADA</option>
		
	</select>
	
	<input type="submit" name="submit" value="Submit"/>
	
	
	</form>


</body>
</html>