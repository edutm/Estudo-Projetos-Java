<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include> 

	<script type="text/javascript">
		$(document).ready(function() {

			var listaEvento = new Array();
			<c:forEach items='${eventos}' var='evento'> 
		    	evento = new Object();
		    	evento.id = ${evento.id};
		    	evento.title = '${evento.titulo}';
		    	evento.start = '${evento.dataInicio}';
		    	evento.end = '${evento.dataFim}';
		    	listaEvento.push(evento);
			</c:forEach> 
			
			var currentLangCode = 'pt-br';
			
			$('#calendar').fullCalendar({
				header: {
					left: 'prev,next today',
					center: 'title',
					right: 'month,basicWeek,basicDay'
				},
				defaultDate: '2016-01-12',
				lang: currentLangCode,
				editable: true,
				eventLimit: true, // allow "more" link when too many events
				eventClick: function(calEvent, jsEvent, view) {
					var id = calEvent.id;
					abrirModal(id);

				},
				events: listaEvento
			});

			$("#linkAdd").click(function(){
				$("#id").val("");
				$("#titulo").val("");
				$("#dataInicio").val("");
				$("#dataFim").val("");
		        $("#myModal").modal();
		    });

			
			
		});

		function abrirModal(id){
			$.ajax({
				method: 'post',
				url: "<c:url value='/evento'/>",
				data :{ "id" : id},
				success : function(data) {
					$("#id").val(data.id);
					$("#titulo").val(data.titulo);
					$("#dataInicio").val(data.dataInicio);
					$("#dataFim").val(data.dataFim);
					$("#myModal").modal();
				},
				dataType: "json"
			});
		}
	</script>
	<style>
		body {
			margin: 40px 10px;
			padding: 0;
			font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
			font-size: 14px;
		}
		#calendar {
			max-width: 900px;
			margin: 0 auto;
		}
	
	</style>
	
	<div class="container heitght10">
		<div class="row">
			<div id='calendar'></div>
		</div>
	</div>
	
	
	<!-- Modal -->
	  <div class="modal fade" id="myModal" role="dialog">
	    <div class="modal-dialog">
	    
	      <!-- Modal content-->
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <h4 class="modal-title">Novo evento</h4>
	        </div>
	        <div class="modal-body">
	          <form role="form" id="form1" method="post" action="<c:url value="/novoEvento"/>">
				   <input type="hidden"  id="id" name="id" value="">
				  <div class="form-group">
				    <label for="titulo">Titulo:</label>
				    <input type="text" class="form-control" id="titulo" name="titulo">
				  </div>
				  <div class="form-group">
				    <label for="dataInicio">Inicio:</label>
				   	<input type="text" class="form-control" id="dataInicio" name="dataInicio">
				  </div>
				  <div class="form-group">
				    <label for="dataFim">Fim:</label>
				    <input type="text" class="form-control" id="dataFim" name="dataFim">
				  </div>
				</form>
	        </div>
	        <div class="modal-footer">
	          <button id="salvar" type="button" class="btn btn-default" data-dismiss="modal">Salvar</button>
	        </div>
	        <script>
	        	$('#dataInicio').appendDtpicker({
	        		"locale": "br",
	        		"dateFormat": "DD/MM/YYYY hh:mm",
	        		"futureOnly": true
		        });
	        	$('#dataFim').appendDtpicker({
	        		"locale": "br",
	        		"dateFormat": "DD/MM/YYYY hh:mm",
	        		"futureOnly": true
		        });

		        $("#salvar").click(function(){

		        	if($("#id").val() != ""){
		        		$("#form1").attr("action", "<c:url value='/editarEvento'/>");
				    }
		        	$("#form1").submit();
				});
// 		        $("#eee").datepicker({
// 		            dateFormat: 'dd/mm/yy',
// 		            dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],
// 		            dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
// 		            dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
// 		            monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
// 		            monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'],
// 		            nextText: 'Próximo',
// 		            prevText: 'Anterior'
// 		        });
	        </script>

	      </div>
	   
	      
	    </div>
	  </div>
	
	
<jsp:include page="footer.jsp"></jsp:include> 
