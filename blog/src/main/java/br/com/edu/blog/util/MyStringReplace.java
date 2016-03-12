package br.com.edu.blog.util;

import java.text.Normalizer;

public class MyStringReplace {
	
	public static String formatarPermalink(String value){
		
		String link = value.trim();
		
		link = link.toLowerCase();
		
		link = Normalizer.normalize(link, Normalizer.Form.NFD);
		
		link = link.replaceAll("\\s", "_");
		
		link = link.replaceAll("\\W", "");
		
		link = link.replaceAll("\\_+", "_");
		
		
		return link;
	}

}
