<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Usuário</title>
	<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>">

</head>
<body>

	<c:import url="../menu.jsp"/>
	<fieldset>
		<legend>Cadastro de usuário</legend>
	
		<c:url var="salvar" value="/usuario/salvar"/>
		<form:form modelAttribute="usuario" action="${salvar}" 
								method="post" enctype="multipart/form-data">
			<form:hidden path="id"/>
			<div class="campo">
				<form:label path="nome">Nome do Usuário</form:label><br/>
				<form:input path="nome" require="true" type="text"/>
			</div>
			<div class="campo">
				<form:label path="email">E-mail</form:label><br/>
				<form:input path="email" required="true" type="email"/>
			</div>
			<div class="campo">
				<form:label path="email">Senha</form:label><br/>
				<form:password path="senha" required="true"/>
			</div>
			<div class="campo">
				<label for="avatar">Avatar</label>
				<input name="file" type="file" required="true"/>
			</div>
			<div class="campo">
				<form:label path="perfil">Perfil</form:label><br/>
				<form:select path="perfil">
					<form:option value="ADMIN" label="ADMIN" />
					<form:option value="AUTOR" label="AUTOR" />
					<form:option value="LEITOR" label="LEITOR" />
				</form:select>
			</div>
			<div>
				<input type="submit" value="Salvar" />
				<input type="reset" value="Resetar"/>
			</div>
		</form:form>
	</fieldset>
</body>
</html>