package com.schremser.spring.jersey;

import jdk.nashorn.internal.runtime.Logging;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Created by bluemax on 05.03.16.
 */
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(RequestContextFilter.class);
        packages("com.schremser.spring.jersey.rest");
        register(LoggingFilter.class);
    }
}
