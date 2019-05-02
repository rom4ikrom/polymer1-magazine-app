package com.romanov.model;

public class Photo {
    
    private int id;
    private Photographer photographer;
    private String imgPath;
    private String date;
    
    public Photo(int id, Photographer photographer, String imgPath, String date) {
        this.id = id;
        this.photographer = photographer;
        this.imgPath = imgPath;
        this.date = date;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId() {
        this.id = id;
    }

    public Photographer getPhotographer() {
        return photographer;
    }

    public void setPhotographer(Photographer photographer) {
        this.photographer = photographer;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
