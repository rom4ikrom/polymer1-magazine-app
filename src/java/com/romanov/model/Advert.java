package com.romanov.model;

public class Advert {
    
    private int id;
    private String title;
    private String content;
    private String size;
    private Company company;
    
    public Advert(int id, String title, String content, String size, Company company) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.size = size;
        this.company = company;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
}
