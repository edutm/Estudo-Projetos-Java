<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Perfil Autor</title>
	<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>">
</head>
<body>
	<c:import url="../menu.jsp"/>
	<fieldset>
		<legend>Perfil Autor</legend>
		
		<table class="table">
			<tr>
				<th>nome do autor</th>
				<th>email</th>
				<th>data de cadastro</th>
				<th>biografia</th>
				<th>ação</th>
			</tr>
			<c:forEach var="autor" items="${autores}" varStatus="i">
				<tr bgcolor="${i.count % 2 eq 0 ? 'white' : '#f1f1f1'}">
					<td>${autor.nome}</td>
					<td>${autor.usuario.email}</td>
					<td>${autor.usuario.dataCadastro}</td>
					<td>${autor.biografia}</td>
					<td>
						<c:url var="editar" value="/autor/update/${autor.id}"/>
						<a href="${editar}" title="Editar">&#9445</a>
						<c:url var="deletar" value="/autor/deletar/${autor.id}"/>						
						<a href="${deletar}" title="Deletar">&#9447</a>
					</td>
				</tr>
			</c:forEach>	
		</table>
	</fieldset>
	
</body>
</html>