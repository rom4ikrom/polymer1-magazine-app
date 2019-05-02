package com.romanov.model;

public class Story {
    
    private int id;
    private String title;
    private String topic;
    private String content;
    
    public Story(int id, String title, String topic, String content) {
        this.id = id;
        this.title = topic;
        this.topic = topic;
        this.content = content;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
