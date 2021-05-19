package com.kafka.demo.models;

//plain old Java object - pojo
public class MessageBody {
    private final long id;
    private final String content;

    public MessageBody(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
