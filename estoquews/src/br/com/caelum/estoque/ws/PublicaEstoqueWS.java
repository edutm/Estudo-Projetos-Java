package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWS {

	public static void main(String[] args) {


		EstoqueWS estoqueWS = new EstoqueWS();
		String url = "http://localhost:8080/estoquews";
		
		Endpoint.publish(url, estoqueWS);
		System.out.println("serviço rodando em "+url+"?wsdl");

	}

}
