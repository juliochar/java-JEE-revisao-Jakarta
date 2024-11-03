<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Formating Action</h1>
		
		<br/>
		
		<c:set var="quantidade" value="55.875"/>
		
		<fmt:parseNumber var="j" integerOnly="true" type="number" value="${amount }"/>
		
		<p>
			<i>total é:</i>
			<c:out value="${j }"/>
		</p>




	</body>
</html>