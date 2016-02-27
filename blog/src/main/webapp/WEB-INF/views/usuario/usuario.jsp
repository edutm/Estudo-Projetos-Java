<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Usuarios</title>
	<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>">
</head>
<body>
	
	<fieldset>
		<legend>Usuarios</legend>
		
		<table class="table">
			<tr>
				<th>usuário</th>
				<th>email</th>
				<th>data de cadastro</th>
				<th>perfil</th>
				<th>ação</th>
			</tr>
			<c:forEach var="usuario" items="${usuarios}" varStatus="i">
				<tr bgcolor="${i.count % 2 eq 0 ? '#f1f1f1' : white}">
					<td>${usuario.nome}</td>
					<td>${usuario.email}</td>
					<td>${usuario.dataCadastro}</td>
					<td>${usuario.perfil}</td>
					<td>
						<c:url var="editar" value="/usuario/update/${usuario.id}"/>
						<a href="${editar}" title="Editar">&#9445</a>
						<a href="#" title="Deletar">&#9447</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</fieldset>
	
</body>
</html>