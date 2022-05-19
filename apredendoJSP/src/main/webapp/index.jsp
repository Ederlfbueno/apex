<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TESTE TESTE TESTE</title>
</head>
<body>
	Aprendendo JSP na apex !!!
	
	<div>
		<%
		    LocalDateTime objeto = LocalDateTime.now();
		
			out.print(objeto);
		%>
	</div>
</body>
</html>