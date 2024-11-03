<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Java Bean example</title>
	</head>
	<body>
		<jsp:useBean id="student" class="br.juliok.beans.Student">
			<jsp:setProperty name="student" property="firstName" value="Joao"/>
			<jsp:setProperty name="student" property="lastName" value="Rocha"/>
			<jsp:setProperty name="student" property="email" value="joao@joao.com"/>
		</jsp:useBean>
		
		
		<p> Student First Name is: 
		<jsp:getProperty name="student" property="firstName"/>
		</p>
		
		
		<p> Student Last Name is: 
		<jsp:getProperty name="student" property="lastName"/>
		</p>
		
		<p> Student E-mail is: 
		<jsp:getProperty name="student" property="email"/>
		</p>
		 
	</body>
</html>