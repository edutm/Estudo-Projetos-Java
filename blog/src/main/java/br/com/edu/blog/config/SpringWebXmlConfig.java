package br.com.edu.blog.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebXmlConfig implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {

		//registrando classe de configuração spring e setando contexto do server
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(SpringMvcConfig.class);
		webContext.setServletContext(servletContext);
		
		//configurando dispacherServlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webContext);
		//habilitando recurso para pagina de erro
		dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
		
		ServletRegistration.Dynamic reDynamic = 
				servletContext.addServlet("dispacher", dispatcherServlet);
		reDynamic.setLoadOnStartup(1);
		reDynamic.addMapping("/");
		
		//forçando encoding utf-8
		FilterRegistration.Dynamic encoding = 
				servletContext.addFilter("encodingFilter", new CharacterEncodingFilter());
		encoding.setInitParameter("encoding", "UTF-8");
		encoding.setInitParameter("forceEncoding", "true");
		encoding.addMappingForUrlPatterns(null, true, "/*");
		
	}

}
