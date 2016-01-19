package br.com.caelum.estoque.modelo.usuario;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {
	
	private Date data;
	private String mensagem;

	public InfoFault(String mensagem, Date data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this.mensagem=mensagem;
	}
	
	public InfoFault(){
		
	}

	
}
