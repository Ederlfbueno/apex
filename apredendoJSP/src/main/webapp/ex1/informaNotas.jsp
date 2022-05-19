<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Informe as notas do aluno</title>
</head>
<body>
	<form action="verificarAprovacao.jsp">
		<label>Nome do aluno</label>
		<input type="text" name="nome"/>
		<hr>
		<label>Nota 1</label>
		<input type="number" name="nota1"/>
		<label>nota 2</label>
		<input type="number" name="nota2"/>
		<label>Nota 3</label>
		<input type="text" name="nota3"/>
		
		<input type="submit"/>
	</form>
	 
</body>
</html>