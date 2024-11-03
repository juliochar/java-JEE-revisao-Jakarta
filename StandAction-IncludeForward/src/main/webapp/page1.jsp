<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Olá - Primeira Página</h1>
	
	<jsp:include page="page2.jsp">
		<jsp:param name="param1" value="value1"/>
	</jsp:include>
	
</body>
</html>