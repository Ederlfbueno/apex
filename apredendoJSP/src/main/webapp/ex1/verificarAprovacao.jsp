<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String nome = request.getParameter("nome");
		int n1 = Integer.parseInt(request.getParameter("nota1"));
		int n2 = Integer.parseInt(request.getParameter("nota2"));
		int n3 = Integer.parseInt(request.getParameter("nota3"));
		int media = (n1+n2+n3)/3;		
		
		if (media >= 7) {
			out.print("Aluno: " + nome + " foi aprovado com a média: " + media );
		} else if (media >= 5) {
			out.print("Aluno: " + nome + " ficou em exames com a média: " + media );
		} else {
			out.print("Aluno: " + nome + " foi reprovado com a média: " + media );
		}
		
	%>

</body>
</html>