<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include> 

	<div class="container heitght5 col-lg-1 col-offset-6 centered">
		<div class="row">
			<h2>Escolha o usuário para entrar no calendario (Teste)</h2>
			<div class="list-group">
			  <a href="#" class="list-group-item active">
			    Usuários
			  </a>
			  <c:forEach items="${usuarios}" var="usuario">
			  	<a href="<c:url value="/calendario/${usuario.id}"/>" class="list-group-item">${usuario.nome}</a>
			  </c:forEach>
			</div>
		</div>
	</div>
	<script>
		$(document).ready(function() {
			$("#linkAdd").hide();
			
		});
	</script>
	
<jsp:include page="footer.jsp"></jsp:include> 


