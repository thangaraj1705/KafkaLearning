package com.learning.kafka.KafkaMsgSender.dto;

public class MessageDTO {

    private String topic;
    private String msg;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "topic='" + topic + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
