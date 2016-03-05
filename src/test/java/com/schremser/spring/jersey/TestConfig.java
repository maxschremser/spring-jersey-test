package com.schremser.spring.jersey;

import com.schremser.spring.jersey.rest.RootResource;
import com.schremser.spring.jersey.service.MessageService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bluemax on 05.03.16.
 */

@Configuration
@ComponentScan(basePackageClasses = {RootResource.class, MessageService.class})
public class TestConfig {
}
