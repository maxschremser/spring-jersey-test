package com.schremser.spring.jersey.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by bluemax on 05.03.16.
 */

@XmlRootElement
public class Message {
    String author;
    String contents;

    public Message() {}

    public Message(String author, String contents) {
        this.author = author;
        this.contents = contents;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
