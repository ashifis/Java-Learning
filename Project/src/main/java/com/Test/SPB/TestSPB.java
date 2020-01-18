package com.Test.SPB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


import com.HBRest.Project.MyResource;


@ComponentScan("com")
@ComponentScan(basePackageClasses=MyResource.class)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class TestSPB {
	
	public static void main(String args[]) {
		ConfigurableApplicationContext ctx = 	SpringApplication.run(TestSPB.class, args);
		Alien a  = (Alien) ctx.getBean(Alien.class);	
		a.show();
	}

}
