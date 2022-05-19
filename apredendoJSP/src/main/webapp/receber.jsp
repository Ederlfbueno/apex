<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Me pagueeeee !!!!</title>
</head>
<body>
	<%
		String nome = request.getParameter("nome");
		int idade = Integer.parseInt(request.getParameter("idade"));
		
		 out.print("O nome informado é: " + nome + "<hr>");
		 out.print("a idade informada é: " + idade);
	%>
</body>
</html>