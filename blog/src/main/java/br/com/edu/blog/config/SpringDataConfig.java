package br.com.edu.blog.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="br.com.edu.blog.repository")
@EnableTransactionManagement
@PropertySource(value="classpath:/application.properties")
public class SpringDataConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(entityManagerFactory);
		manager.setJpaDialect(new HibernateJpaDialect());
		
		return manager;
	}
	
	@Bean
	public HibernateJpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(env.getProperty("hibernate.show.sql", Boolean.class));
		adapter.setGenerateDdl(env.getProperty("hibernate.ddl", Boolean.class));
		return adapter;
	}
	
	@Bean
	public EntityManagerFactory entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		
//		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//		adapter.setShowSql(true);
//		adapter.setGenerateDdl(true);
		
		factory.setJpaVendorAdapter(jpaVendorAdapter());
		factory.setPackagesToScan(
				env.getProperty("hibernate.package.scan"),
				env.getProperty("java.time.jpa.converter")
				);
		factory.setDataSource(this.dataSource());
		factory.afterPropertiesSet();
		
		return factory.getObject();
	}
	
	@Bean(name = "dataSource")
	public DataSource dataSource(){
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUsername(env.getProperty("jdbc.user"));
		dataSource.setPassword("");
		dataSource.setDriverClassName(env.getProperty("jdbc.driver"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		
		return dataSource;
	}

}
