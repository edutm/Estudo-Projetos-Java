package br.com.agenda.ocio.rest.service.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateUtil {

	private DateUtil(){
		
	}
	
	public static Calendar from(String data) throws ParseException{
		
		SimpleDateFormat sdf;
		if(data.contains("-")){
			data = data.replaceAll("-", "/");
		}
		if(data.contains("T")){
			sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		} else {
			sdf = new SimpleDateFormat("dd/MM/yyyy");
		}
		data = data.replaceAll("T", " ");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(data));
		
		return cal;
	}
	
	public static String to(Calendar calendar){
		
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		
		String hora = sdf.format(calendar.getTime());
		hora = hora.replaceAll(" ", "T");
		return hora;
	}
}
