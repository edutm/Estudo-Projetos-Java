<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
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
		<c:forEach var="p" items="${postagens}">
			<div>
				<div>
					<a href='<c:url  value="/${p.permalink}"/>'><h2>${p.titulo}</h2></a>
					<p>Autor: <a href='<c:url  value="/autor/${p.autor.nome}"/>'>${p.autor.nome}</a> 
					<fmt:parseDate var="date" value="${p.dataPostagem}" pattern="yyyy-MM-dd'T'HH:mm:ss"/>
					| Data: <fmt:formatDate value="${date}" type="both"/>  
					</p>
				</div>
				<div>
					<p class="post-texto">
						<c:forTokens var="resumo" items="${p.texto}" delims="." begin="0" end="1" varStatus="i">
							${resumo}<c:if test="${i.count eq 2}"><a href='<c:url  value="/${p.permalink}"/>'>[leia mais]</a></c:if>
						</c:forTokens>
					</p>
				</div>
				<div>
					<p class="post-categoria">
					<span>Categorias:</span>
						<c:forEach var="c" items="${p.categorias}">
							<a href='<c:url  value="/categoria/${c.permalink}"/>' title="${c.descricao}">${c.descricao}</a>
						</c:forEach>
					</p>
				</div>
			</div>
		</c:forEach>	
	</fieldset>
</body>
</html>
