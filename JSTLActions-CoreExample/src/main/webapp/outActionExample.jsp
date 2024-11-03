<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>

<!-- 

	para colocar para funcionar com tomcat 10.x ou superior com jakarta
	https://stackoverflow.com/questions/4928271/how-to-install-jstl-it-fails-with-the-absolute-uri-cannot-be-resolved-or-una
	
	baixar dois JAR da nova implementação, 
	
	jakarta.servlet.jsp.jstl-3.0.1.jar
	jakarta.servlet.jsp.jstl-api-3.0.0
	
	com a atualização para jakart.* tem que adicionar o jar da API junto com jar do JSTL implementado

	https://jakarta.ee/specifications/tags/3.0/jakarta-tags-spec-3.0
	
 -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>Action Example</title>
	</head>
	<body>
	
		<!--  usando JSTL -->
		<!--  Precisa importar o JAR do JSTL no buildpath -->
		
		<c:out value="olá, out example - STL"/>
		
		<br/>
		<c:out value="${'Bem vindo ao JSTL'}" />
		
		
		
		<br/>
		For each:
		
		<br/>
		
		<c:forEach var="j" begin="1" end="3">
			Item: <c:out value='<%=pageContext.getAttribute("j") %>' /> <!--  Expression language -->
			<br/>
		</c:forEach>
		
		
		<c:forTokens items="Red-Green-Blue" delims="-" var="nome">
			<c:out value='<%=pageContext.getAttribute("nome") %>'/>
			<br/>
		</c:forTokens>
		
		
		
		
		
		
		
		
		
	
	</body>
</html>