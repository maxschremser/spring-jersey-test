package com.schremser.spring.jersey;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringJerseyTestApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringJerseyTestApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
	}

	@Bean
	public ServletRegistrationBean jerseyServlet() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new ServletContainer(), "/api/*");
		registrationBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
		return registrationBean;
	}
}
