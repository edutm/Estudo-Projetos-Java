package br.com.caelum.correio.teste;

import java.math.BigDecimal;
import java.util.List;

import br.com.caelum.correio.CResultado;
import br.com.caelum.correio.CServico;
import br.com.caelum.correio.CalcPrecoPrazoWS;
import br.com.caelum.correio.CalcPrecoPrazoWSSoap;

public class TesteClienteCorreios {

	public static void main(String[] args) {
		
		
		CalcPrecoPrazoWSSoap wsSoap = new CalcPrecoPrazoWS().getCalcPrecoPrazoWSSoap();
		
		String codigoSedex = "40010";
		String cepOrigemCaelumSP = "04101300"; //Caelum SP
		String peso3kg = "3";
		BigDecimal comprimento20cm = new BigDecimal(20);
		BigDecimal altura10cm = new BigDecimal(10);
		BigDecimal largura15cm = new BigDecimal(15);
		BigDecimal diametro10cm = new BigDecimal(10);
		int formatoEncomendaCaixa = 1; // 1 é caixa ou pacote
		BigDecimal semValorDeclarado= BigDecimal.ZERO;
		String semEntregueEmMaos = "N";
		String semAvisoRecebimento = "N";
		String semCodigoEmpresa = "";
		String semSenhaEmpresa = "";
		
		CResultado precoPrazo = wsSoap.calcPrecoPrazo(semCodigoEmpresa, semSenhaEmpresa, codigoSedex, cepOrigemCaelumSP, cepOrigemCaelumSP, peso3kg, formatoEncomendaCaixa, comprimento20cm, altura10cm, largura15cm, diametro10cm, semEntregueEmMaos, semValorDeclarado, semAvisoRecebimento);
		List<CServico> servico = precoPrazo.getServicos().getCServico();
		
		String valor = servico.get(0).getValor();
		System.out.println(valor);

	}

}
