package br.com.caelum.estoque.cliente;

public class TestaClienteSoap {
	
	public static void main(String[] args) {
		
		EstoqueWS ws = new EstoqueWSService().getEstoqueWSPort();
		
		Filtro filtro = new Filtro();
		filtro.setNome("IPhone");
		filtro.setTipo(TipoItem.CELULAR);;

		Filtros filtros = new Filtros();
		filtros.getFiltro().add(filtro);
		
		Item lista = ws.todosOsItens(filtros);
		

		System.out.println("Resposta do serviço: " + lista);
	}

}
