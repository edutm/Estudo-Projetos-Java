package br.com.caelum.estoque.teste;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.caelum.estoque.modelo.item.Item;

public class TesteItemParaXML {

	
	public static void main(String[] args) throws JAXBException {
		Item item = new Item.Builder().comCodigo("MEIA")
										.comNome("MEAN")
										.comQuantidade(1)
										.comTipo("Livro")
										.build();
		JAXBContext context = JAXBContext.newInstance(Item.class);
		
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(item, new File("item.xml"));
	}
}
