<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<fieldset>
	<legend>Menu</legend>
	
	
	<nav>
		<a href='<c:url  value="/"/>' title="home">home</a>
	</nav>
	<nav>
		<a href='<c:url value="/usuario/add"/>'>Add usuário</a>
		<a href='<c:url value="/usuario/lista"/>'>Lista usuários</a>
	</nav>
	<nav>
		<a href='<c:url value="/autor/add"/>'>Add autor</a>
		<a href='<c:url value="/autor/lista"/>'>Lista autores</a>
	</nav>
	<nav>
		<a href='<c:url value="/postagem/add"/>'>Add postagem</a>
		<a href='<c:url value="/postagem/lista"/>'>Lista de postagens</a>
	</nav>
	<nav>
		<a href='<c:url value="/categoria/cadastrar"/>'>Lista/Cadastrar categoria</a>
	</nav>
</fieldset>