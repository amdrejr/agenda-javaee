<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<title>Editar Contato</title>
<link rel="icon" href="imagens/favicon-32x32.png" />
<link rel="stylesheet" href="style.css" />

</head>

<body>
	<main>
		<h1>Editar contato</h1>
		<form name="frmContato" action="update">
	
			<table>
				<tr>
					<td><input type="text" name="idcon" id="caixa3" value="<%out.print(request.getAttribute("idcon"));%>" readonly></td>
				</tr>
				<tr>
					<td><input type="text" name="nome" class="caixa1" placeholder="Nome" value="<%out.print(request.getAttribute("name"));%>"></td>
				</tr>
				<tr>
					<td><input type="text" name="fone" class="caixa1" placeholder="Fone" value="<%out.print(request.getAttribute("fone"));%>"></td>
				</tr>
				<tr>
					<td><input type="text" name="email" class="caixa1" placeholder="E-mail" value="<%out.print(request.getAttribute("email"));%>"></td>
				</tr>	
			</table>
			<input type="button" value="Salvar" class="botao1" onclick="validar()">
		</form>
	
		<script src="scripts/validador.js"></script>
	</main>
</body>

</html>