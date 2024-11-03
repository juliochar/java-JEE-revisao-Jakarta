<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="page3.jsp"%> <!--  aqui é incluído no Translation time do JSP -->
<!--  para conteúdos estáticos como cabeçalhos e html, é recomendado o uso de include pela diretiva usando @ -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Olá, esta é a pagina 1</h1>
	
	<jsp:include page="page2.jsp"></jsp:include><!--  aqui é JSP Action - incluída na execution time do JSP -->
	<!--  include action é melhor recomendado para conteúdos dynamicos como JSP -->
</body>
</html>