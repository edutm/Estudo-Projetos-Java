<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Postagens</title>
	<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>">
</head>
<body>
	<c:import url="../menu.jsp"/>
	<fieldset>
		<legend>Lista de postagens</legend>
		
		<table class="table">
			<tr>
				<th>codigo</th>
				<th>titulo do post</th>
				<th>permalink</th>
				<th>data da postagem</th>
				<th>autor</th>
				<th>categorias</th>
				<th>ação</th>
			</tr>
			<c:forEach var="postagem" items="${postagens}" varStatus="i">
				<tr bgcolor="${i.count % 2 eq 0 ? 'white' : '#f1f1f1'}">
					<td>${postagem.id}</td>
					<td>${postagem.titulo}</td>
					<td>${postagem.permalink}</td>
					<td>${postagem.dataPostagem}</td>
					<td>${postagem.autor.nome}</td>
					<td>
						<c:forEach var="c" items="${postagem.categorias}">
							[ ${c.descricao} ]
						</c:forEach>
					</td>
					<td>
						<c:url var="editar" value="/postagem/update/${postagem.id}"/>
						<a href="${editar}" title="Editar">&#9445</a>
						<c:url var="deletar" value="/postagem/deletar/${postagem.id}"/>						
						<a href="${deletar}" title="Deletar">&#9447</a>
					</td>
				</tr>
			</c:forEach>	
		</table>
	</fieldset>
	
</body>
</html>