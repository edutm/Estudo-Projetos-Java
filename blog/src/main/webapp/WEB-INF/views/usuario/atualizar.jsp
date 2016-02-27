<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Editar Usuário</title>
	<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>">

</head>
<body>

	<fieldset>
		<legend>Editar dados do usuário</legend>
		<fieldset class="grupo">
			<legend>Alterar Senha</legend>
			<c:url var="save" value="/usuario/updateSenha"/>
			<form:form modelAttribute="usuario" action="${save}" method="post">
				<form:hidden path="id"/>
				<div class="campo">
					<form:label path="senha">Senha</form:label>
					<form:password path="senha"/>
				</div>
				<div>
					<input type="submit" value="Salvar">
					<input type="reset"  value="Limpar">
				</div>
			</form:form>
		</fieldset>
	
		<fieldset class="grupo">
			<legend>Editar nome e/ou e-mail</legend>
			<c:url var="save" value="/usuario/update"/>
			<form:form modelAttribute="usuario" action="${save}" method="post">
				<form:hidden path="id"/>
				<div class="campo">
					<form:label path="nome">Nome do Usuário</form:label><br/>
					<form:input path="nome" required="true" type="text"/>
				</div>
				<div class="campo">
					<form:label path="email">E-mail</form:label><br/>
					<form:input path="email" required="true" type="email"/>
				</div>
				<div>
					<input type="submit" value="Salvar" />
					<input type="reset" value="Resetar"/>
				</div>
			</form:form>
		</fieldset>
	</fieldset>
</body>
</html>