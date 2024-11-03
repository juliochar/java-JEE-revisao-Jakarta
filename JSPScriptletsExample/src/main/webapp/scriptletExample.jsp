<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Scriptlet Example</title>
	</head>
	<body>
	
	<!--  Servlet class -->
	<%!
		//declaração - ! 
		//java expression na chamada do metodo
		//delcaração class level - expression - page level
		public String sayHello(){
			return "Olá from JSP";
		}
	
	
	%>
	<br/>
	
	<%=
	//printwriter implicito 
		sayHello()
	%>
	<br/>
	
	<% out.println(sayHello());
		
	response.getWriter().println(sayHello());
	
	%>
	<br/>
	
	</body>
</html>