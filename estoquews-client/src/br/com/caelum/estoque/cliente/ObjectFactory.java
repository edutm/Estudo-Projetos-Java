
package br.com.caelum.estoque.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.estoque.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TokenUsuario_QNAME = new QName("http://ws.estoque.caelum.com.br/", "tokenUsuario");
    private final static QName _Filtros_QNAME = new QName("http://ws.estoque.caelum.com.br/", "filtros");
    private final static QName _AutorizacaoFault_QNAME = new QName("http://ws.estoque.caelum.com.br/", "AutorizacaoFault");
    private final static QName _ListaItens_QNAME = new QName("http://ws.estoque.caelum.com.br/", "listaItens");
    private final static QName _Item_QNAME = new QName("http://ws.estoque.caelum.com.br/", "item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.estoque.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link InfoFault }
     * 
     */
    public InfoFault createInfoFault() {
        return new InfoFault();
    }

    /**
     * Create an instance of {@link ListaItens }
     * 
     */
    public ListaItens createListaItens() {
        return new ListaItens();
    }

    /**
     * Create an instance of {@link Filtros }
     * 
     */
    public Filtros createFiltros() {
        return new Filtros();
    }

    /**
     * Create an instance of {@link TokenUsuario }
     * 
     */
    public TokenUsuario createTokenUsuario() {
        return new TokenUsuario();
    }

    /**
     * Create an instance of {@link Filtro }
     * 
     */
    public Filtro createFiltro() {
        return new Filtro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "tokenUsuario")
    public JAXBElement<TokenUsuario> createTokenUsuario(TokenUsuario value) {
        return new JAXBElement<TokenUsuario>(_TokenUsuario_QNAME, TokenUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filtros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "filtros")
    public JAXBElement<Filtros> createFiltros(Filtros value) {
        return new JAXBElement<Filtros>(_Filtros_QNAME, Filtros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "AutorizacaoFault")
    public JAXBElement<InfoFault> createAutorizacaoFault(InfoFault value) {
        return new JAXBElement<InfoFault>(_AutorizacaoFault_QNAME, InfoFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaItens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "listaItens")
    public JAXBElement<ListaItens> createListaItens(ListaItens value) {
        return new JAXBElement<ListaItens>(_ListaItens_QNAME, ListaItens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

}
