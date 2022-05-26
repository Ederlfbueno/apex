<%@page import="conexao.conexao" %>
<%@page import="java.sql.PreparedStatement" %>
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
		conexao conn = new conexao(); 
		String nome = request.getParameter("nome"); 
		String sobrenome = request.getParameter("sobrenome"); 
		int idade = Integer.parseInt(request.getParameter("idade")); 
		int anoNascimento = Integer.parseInt(request.getParameter("anoNasc"));
		String cidade = request.getParameter("cidade");
		
		try { 
			String sql ="INSERT INTO cadastrojsp (nome, sobrenome, cidade, idade, anoNascimento) "
						+ " VALUES (?,?,?,?,? )"; 
			
			PreparedStatement psmt = conn.conectar().prepareCall(sql); 
			
			psmt.setString(1, nome);
			psmt.setString(2, sobrenome);
			psmt.setString(3, cidade);
			psmt.setInt(4, idade); 
			psmt.setInt(5, anoNascimento);
			
			psmt.execute(); 
			
			
			out.print("Registro inserido com sucesso!");
		} catch (Exception e) {
			 out.print("ERRO NA INSERÇÂO " + e.getMessage() + "<hr>");
		}
	%>
</body>
</html>