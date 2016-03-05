package com.schremser.spring.jersey;

import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.ws.rs.core.Application;

/**
 * Created by bluemax on 05.03.16.
 */
public class RootResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        enable(TestProperties.LOG_TRAFFIC);
        enable(TestProperties.DUMP_ENTITY);
        // return new ResourceConfig(RootResource.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        // contextConfig = SpringComponentProvider.PARAM_SPRING_CONTEXT
        return new JerseyConfig().property("contextConfig", context);
    }

    @Test
    public void testHello() {
        final String hello = target("hello").request().get(String.class);
        assert hello.equals("Hello World");
    }

    @Test
    public void testMessages() throws JSONException {
        final String messages = target("messages").request().get(String.class);
        String expected = "[{'author':'Hello', 'contents': 'World'}]";
        JSONAssert.assertEquals(expected, messages, JSONCompareMode.LENIENT);
    }
}
