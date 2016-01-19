package br.com.agenda.ocio.rest.service.resource;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.objectweb.asm.tree.TableSwitchInsnNode;

public class TEste {

	public static void main(String[] args) throws ParseException {
		
		String data = "2016-01-12";
		
		SimpleDateFormat sdf;
		if(data.contains("T")){
			sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		} else {
			sdf = new SimpleDateFormat("yyyy-MM-dd");
		}
		data = data.replaceAll("T", " ");
		System.out.println(data);
		Calendar cal = Calendar.getInstance();
		System.out.println(sdf.parse(data));
		cal.setTime(sdf.parse(data));
		System.out.println(cal.get(Calendar.DATE));
		
		
		

	}

}
