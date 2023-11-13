<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans" %>
<%@ page import="java.util.ArrayList" %>

<%
	@ SuppressWarnings ("unchecked")
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("contatos");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<title>Agenda de Contatos</title>
<link rel="icon" href="imagens/favicon.png" >
<link rel="stylesheet" href="style.css" >


</head>
<body>
	<main>
		<h1>Agenda de Contatos</h1>
		<a href="novo.html" class="botao1">Novo contato</a>
		<a href="report" class="botao1">Imprimir</a>
		<table id="tabela">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Fone</th>
					<th>E-mail</th>
					<th colspan="2">Opções</th>
				</tr>
			</thead>
			<tbody>
				<!-- Sim, é essa sintaxe tudo misturada -->
				<%for(JavaBeans u : lista) {%> <!-- java -->
					<tr> <!-- html -->
						<td><%= u.getIdcon() %></td>
						<td><%= u.getName() %></td>
						<td><%= u.getFone() %></td>
						<td><%= u.getEmail() %></td>
						<td class="colorido"><a href="select?idcon=<%=u.getIdcon()%>">Editar</a></td>
						<td class="colorido"><a href="javascript: confirmar(<%=u.getIdcon()%>)">Excluir</a></td>
					</tr> <!-- html -->
				<% } %> <!-- java -->
				
			</tbody>
		</table>
		<script src="scripts/confirmador.js"></script>
	</main>
</body>
</html>