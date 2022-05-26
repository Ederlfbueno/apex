<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ProdutoFanalizar.jsp" method="POST"> 
		 <label>Codigo Produto</label>
		 <input type="text" name="codigo"/>

		 <label>Descrição</label>
		 <input type="text" name="descricao"/>

		 <label>Data fabricação</label>
		 <input type="date" name="dtFab"/>
		 
		 <label>Cor</label>
		 <input type="text" name="cor"/>
		 
		 <input type="submit" />
	</form>

</body>
</html>