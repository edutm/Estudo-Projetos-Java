package br.com.caelum.estoque.modelo.usuario;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault", messageName="AutorizacaoFault")
public class AutenticacaoException extends Exception {

	public AutenticacaoException(String mensagem) {
		super(mensagem);
	}
	
	public InfoFault getFaultInfo(){
		return new InfoFault("Token Invalido", new Date());
	}

}
