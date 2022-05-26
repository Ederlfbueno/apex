<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro cliente</title>
</head>
<body>
	<form action="CadastroClienteFinaliza.jsp" method="POST"> 
		 <label>Nome</label>
		 <input type="text" name="nome"/>

		 <label>Sobrenome</label>
		 <input type="text" name="sobrenome"/>

		 <label>Idade</label>
		 <input type="number" name="idade"/>

		 <label>Ano nascimento</label>
		 <input type="number" name="anoNasc"/>
		 
		 <label>Cidade</label>
		 <input type="text" name="cidade"/>
		 
		 <input type="submit" />
	</form>
</body>
</html>