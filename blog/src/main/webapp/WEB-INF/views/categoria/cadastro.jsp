<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Categoria</title>
	<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>">

</head>
<body>
	<fieldset class="grupo">
		<c:import url="../menu.jsp"/>
		<fieldset class="grupo">
			<legend>Cadastro de categoria</legend>
		
			<c:url var="salvar" value="/categoria/salvar"/>
			<form:form modelAttribute="categoria" action="${salvar}">
				<form:hidden path="id"/>
				<div class="campo">
					<form:label path="descricao">Descrição</form:label><br/>
					<form:input path="descricao" require="true" type="text"/>
				</div>
				<div>
					<input type="submit" value="Salvar" />
					<input type="reset" value="Resetar"/>
				</div>
			</form:form>
		</fieldset>
		
		<fieldset class="grupo">
			<legend>Lista de categorias</legend>
			
			<table class="table">
				<tr>
					<th>id</th>
					<th>descrição</th>
					<th>permalink</th>
					<th>ação</th>
				</tr>
				<c:forEach var="categoria" items="${categorias}" varStatus="i">
					<tr bgcolor="${i.count % 2 eq 0 ? 'white' : '#f1f1f1'}">
						<td>${categoria.id}</td>
						<td>${categoria.descricao}</td>
						<td>${categoria.permalink}</td>
						<td>
							<c:url var="editar" value="/categoria/update/${categoria.id}"/>
							<a href="${editar}" title="Editar">&#9445</a>
							<c:url var="deletar" value="/categoria/deletar/${categoria.id}"/>						
							<a href="${deletar}" title="Deletar">&#9447</a>
						</td>
					</tr>
				</c:forEach>	
			</table>
		</fieldset>
	</fieldset>
</body>
</html>