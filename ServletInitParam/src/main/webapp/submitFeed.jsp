<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de resposta</title>
</head>
<body>
	<h1>Envie sua resposta:</h1>
	
	<form action="feedbackServlet" method="post">
		<textarea rows="5" name="feedbackParam"></textarea>
		<input type="submit" name="submit" value="Enviar..."/>
	</form>
</body>
</html>