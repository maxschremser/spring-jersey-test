package com.schremser.spring.jersey.rest;

import com.schremser.spring.jersey.domain.Message;
import com.schremser.spring.jersey.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")

public class RootResource {

    @Autowired
    private MessageService messageService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello")
    public String root() {
        return "Hello World";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/messages")
    public List<Message> messages() {
        return messageService.getMessages();
    }
}
