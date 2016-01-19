package br.com.agenda.ocio.util;

public class DateUtil {
	
	private DateUtil(){
		
	}
	public static String formatarDataParaServico(String data){
		return data.replaceAll(" ", "T");
	}
	
	public static String formatarDataParaForm(String data){
		
		String ano = data.substring(0, 4);
		String mes = data.substring(5, 7);
		String dia = data.substring(8, 10);
		String hora = data.substring(11);
		
		StringBuilder sb = new StringBuilder();
		sb.append(dia)
		  .append("/")
		  .append(mes)
		  .append("/")
		  .append(ano)
		  .append(" ")
		  .append(hora);
		
		return sb.toString();
	}

}
