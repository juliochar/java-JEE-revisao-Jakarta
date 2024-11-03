<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teste Cookie</title>
</head>
<body>

	<form action="loginServlet" method="POST">
		<label>Username: </label>
		<input type="text" name="userName"/>
		
		<label>Password: </label>
		<input type="text" name="password"/>
		
		<input type="submit" name="Login" value="Login" />
		
		
	</form>

</body>
</html>