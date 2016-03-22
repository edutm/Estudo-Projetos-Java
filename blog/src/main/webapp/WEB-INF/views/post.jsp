<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>${postagem.titulo}</title>
	<link type="text/css" rel="stylesheet" href="<c:url value='/css/style.css'/>">

</head>
<body>
	<a href='<c:url  value="/"/>' title="home">
		<fieldset class="header">
			<h1>Blog para estudo Spring-Data</h1>
		</fieldset> <br/>
	</a>

	<c:import url="menu.jsp"/><br/>
	
	<fieldset>
			<div>
				<div>
					<a href='<c:url  value="/${postagem.permalink}"/>'><h2>${postagem.titulo}</h2></a>
					<p>Autor: <a href='<c:url  value="/autor/${postagem.autor.nome}"/>'>${p.autor.nome}</a> 
					<fmt:parseDate var="date" value="${postagem.dataPostagem}" pattern="yyyy-MM-dd'T'HH:mm:ss"/>
					| Data: <fmt:formatDate value="${date}" type="both"/>  
					</p>
				</div>
				<div>
					<p class="post-texto">
						${postagem.texto}
					</p>
				</div>
				<div>
					<p class="post-categoria">
					<span>Categorias:</span>
						<c:forEach var="c" items="${postagem.categorias}">
							 <a href='<c:url  value="/categoria/${c.permalink}"/>' title="${c.descricao}">${c.descricao}</a>
						</c:forEach>
					</p>
				</div>
				<div class="post-autor">
					<img class="post-avatar" alt="Avatar" src='<c:url value="/avatar/loadAvatar/${postagem.autor.usuario.avatar.id}"/>'/>
					<p><strong>${postagem.autor.nome}</strong></p>
					<p>${postagem.autor.biografia}</p>
				</div>
			</div>
	</fieldset>
</body>
</html>
