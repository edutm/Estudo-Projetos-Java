<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Autor</title>
	<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>">

</head>
<body>

	<c:import url="../menu.jsp"/>
	<fieldset>
		<legend>Cadastro de autor</legend>
	
		<c:url var="salvar" value="/autor/salvar"/>
		<form:form modelAttribute="autor" action="${salvar}">
			<form:hidden path="id"/>
			<div class="campo">
				<form:label path="nome">Nome do Usuário</form:label><br/>
				<form:input path="nome" require="true" type="text"/>
			</div>
			<div class="campo">
				<form:label path="biografia">Biografia</form:label><br/>
				<form:textarea required="true" cols="50" rows="10" nome="biografia" path="biografia"/>
			</div>
			<div>
				<input type="submit" value="Salvar" />
				<input type="reset" value="Resetar"/>
			</div>
		</form:form>
	</fieldset>
</body>
</html>