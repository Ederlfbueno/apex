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
		String codigo = request.getParameter("codigo"); 
		String descicao = request.getParameter("descricao"); 
		String anoFab =  request.getParameter("dtFab"); 
		String cor = request.getParameter("cor");
		
		try { 
			String sql ="INSERT INTO produto (codigo, descricao, dtfab, cor) "
						+ " VALUES (?,?,?,?)"; 
			
			PreparedStatement psmt = conn.conectar().prepareCall(sql); 
			
			psmt.setString(1, codigo);
			psmt.setString(2, descicao);
			psmt.setString(3, anoFab);
			psmt.setString(4, cor); 
			
			psmt.execute(); 
			
			
			out.print("Registro inserido com sucesso!");
		} catch (Exception e) {
			 out.print("ERRO NA INSERÇÂO " + e.getMessage() + "<hr>");
		}
	%>

</body>
</html>