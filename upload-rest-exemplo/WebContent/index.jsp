<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teste serviço rest upload</title>
</head>
<body>

	Escolha: <input type="file" name="arquivo_upload" /><br/>
	<button id="enviar">Enviar</button>
	
	
</body>

<script   src="https://code.jquery.com/jquery-2.2.3.min.js"   
			integrity="sha256-a23g1Nt4dtEYOj7bR+vTu7+T8VP13humZFBJNIYoEJo="   
			crossorigin="anonymous"></script>
			
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#enviar").click(function(){
			
			var file = $("input[name='arquivo_upload']").get(0).files[0];
			
			//criando objeto serializado para passar pelo ajax
			var formData = new FormData();
			formData.append("file", file);
			
			$.ajax({
				url : "api/upload",
				type : "POST",
				data : formData,
				cache : false,
				contentType : false,
				processData : false,
				success : function(){
					alert("Upload feito com sucesso");
				},
				error : function(e){
					alert("erro : " + e.ResponseText);
				}
			});
		});
	});
</script>			
</html>