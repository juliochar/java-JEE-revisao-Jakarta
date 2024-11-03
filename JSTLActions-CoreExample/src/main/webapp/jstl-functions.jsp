<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="fn" uri="jakarta.tags.functions" %>
<!-- 

	Functional Area	URI	Prefix
core

jakarta.tags.core

c

XML processing

jakarta.tags.xml

x

I18N capable formatting

jakarta.tags.fmt

fmt

relational db access (SQL)

jakarta.tags.sql

sql

Functions

jakarta.tags.functions

fn



 -->



<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Functions....</title>
	</head>
	<body>
		<h1>LowerCase</h1>
		<br/>
		
		<c:set var="texto" value="Servlet and JSP and JSTL - entendendo funções"/>
		<!--Texto antes da conversão: <c:out value="${text}"/><br/><br/> -->
		
		Texto antes da conversão: <c:out value='<%=pageContext.getAttribute("texto") %>'/><br/><br/>
		
		
		
		<c:set var="texto" value="${fn:toLowerCase(texto)}"/>
		Texto Depois da conversão: <c:out value='<%=pageContext.getAttribute("texto") %>'/><br/><br/>
		



	</body>
</html>