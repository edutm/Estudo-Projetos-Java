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
		<legend>Cadastro de postagem</legend>
	
		<c:url var="salvar" value="/postagem/salvar"/>
		<form:form modelAttribute="postagem" action="${salvar}">
			<form:hidden path="id"/>
			<div class="campo">
				<form:label path="titulo">Titulo</form:label><br/>
				<form:input path="titulo" require="true" type="text"/>
			</div>
			<div class="campo">
				<form:label path="texto">Postagem</form:label><br/>
				<form:textarea required="true" cols="80" rows="15" nome="texto" path="texto"/>
			</div>
			<div class="campo">
				<form:label path="categorias">Escolha a(a) categoria(s):</form:label><br/>
				<form:select path="categorias" multiple="true">
					<form:options items="${categorias}" itemValue="id" itemLabel="descricao"/>
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