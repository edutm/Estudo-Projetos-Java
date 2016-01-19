package br.com.agenda.ocio.webtarget;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.springframework.stereotype.Component;

@Component
public class WebTargetFactory {
	
	
	private static Client client;
	
	public WebTargetFactory(){
		if(client == null){
			client = ClientBuilder.newClient();
		}
	}
	
	public WebTarget getWebTarget(){
		return client.target("http://localhost:8080/agenda-ocio-rest-service-app");
	}

}
