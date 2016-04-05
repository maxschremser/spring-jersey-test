package com.schremser.spring.jersey;

import com.schremser.spring.jersey.rest.RootResource;
import com.schremser.spring.jersey.service.MessageService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {RootResource.class, MessageService.class})
public class TestConfig {
}
