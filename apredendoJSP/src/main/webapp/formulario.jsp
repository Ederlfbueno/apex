<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get e POST</title>
</head>
<body>

	<form action="receber.jsp" method="POST">
		 <label>Nome</label>
		 <input type="text" name="nome"/>

		 <label>Idade</label>
		 <input type="number" name="idade"/>
		 
		 <input type="submit" />
		
	</form>
</body>
</html>