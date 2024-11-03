<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>


<%

	String userName = request.getParameter("userName");

	if(userName == null || userName.equals("")){
		throw new Exception();
	}
	else {
		out.print("Welcome " + userName);
	}
%>

</body>
</html>