package com.schremser.spring.jersey.service;

import com.schremser.spring.jersey.domain.Message;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bluemax on 05.03.16.
 */
@Singleton
@Service
public class MessageService {
    List<Message> messages = Collections.synchronizedList(new ArrayList<>());

    @PostConstruct
    public void init() {
        messages.add(new Message("Hello", "World"));
    }

    public List<Message> getMessages() {
        return messages;
    }
}
