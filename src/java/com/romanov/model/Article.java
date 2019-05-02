package com.romanov.model;

public class Article extends Story {
    
    private Journalist journalist;
    private String date;
    
    public Article(int id, String title, String topic, String content, Journalist journalist, String date) {
        super(id, title, topic, content);
        this.journalist = journalist;
        this.date = date;
    }

    public Journalist getJournalist() {
        return journalist;
    }

    public void setJournalist(Journalist journalist) {
        this.journalist = journalist;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
