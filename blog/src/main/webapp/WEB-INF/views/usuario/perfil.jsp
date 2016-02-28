<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Perfil</title>
	<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>">
</head>
<body>
	<c:import url="../menu.jsp"/>
	<fieldset>
		<legend>Perfil</legend>
		
		<table class="table">
			<tr>
				<th>avatar</th>
				<th>usuário</th>
				<th>email</th>
				<th>data de cadastro</th>
				<th>perfil</th>
				<th>ação</th>
			</tr>
			<tr>
				<td>
					<a href="<c:url value="/avatar/update/${usuario.avatar.id}" />" title="Editar Avatar">
						<img alt="Avatar" src='<c:url value="/avatar/loadAvatar/${usuario.avatar.id}"/>' 
																			style="width: 25px; height: 25px" />
					</a>
				</td>
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
		</table>
	</fieldset>
	
</body>
</html>