package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ItemValidador;
import br.com.caelum.estoque.modelo.item.ListaItens;
import br.com.caelum.estoque.modelo.usuario.AutenticacaoException;
import br.com.caelum.estoque.modelo.usuario.TokenDao;
import br.com.caelum.estoque.modelo.usuario.TokenUsuario;

@WebService
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public class EstoqueWS {

	ItemDao itemDao = new ItemDao();

	@WebMethod(operationName = "TodosOsItens")
	@WebResult(name = "item")
	@ResponseWrapper(localName = "itens")
	@RequestWrapper(localName = "listaItens")
	public ListaItens getItens(@WebParam(name = "filtros") Filtros filtros) {

		System.out.println("Chamado todos itens!");
		List<Filtro> lista = filtros.getLista();
		List<Item> itensResultado = itemDao.todosItens(lista);
		return new ListaItens(itensResultado);

	}

	@WebMethod(operationName = "CadastrarItem")
	@WebResult(name = "item")
	public Item cadastrarItem(@WebParam(name = "tokenUsuario", header = true) TokenUsuario tokenUsuario,
			@WebParam(name = "item") Item item) throws AutenticacaoException {
		System.out.println("Cadastrando: " + item + ", token: " + tokenUsuario);
		
		boolean valido = new TokenDao().ehValido(tokenUsuario);
		if(!valido){
			throw new AutenticacaoException("Autenticação falhou!");
		}
		
		new ItemValidador(item).validate();
		itemDao.cadastrar(item);
		return item;
	}

}
