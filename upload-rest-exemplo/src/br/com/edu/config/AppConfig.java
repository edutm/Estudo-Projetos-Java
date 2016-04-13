package br.com.edu.config;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.media.multipart.MultiPartFeature;

@ApplicationPath("/api")
public class AppConfig extends Application{
	
	
	@Override
	public Set<Class<?>> getClasses() {
		
		Set<Class<?>> resources = new HashSet<Class<?>>();
		resources.add(MultiPartFeature.class);
		return resources;
	}
	
	@Override
	public Map<String, Object> getProperties() {
		
		Map<String, Object> props = new HashMap<String, Object>();
		props.put("jersey.config.server.provider.packages", "br.com.edu.resources");
		
		return props;
	}
	
}
