package com.romanov.model;

public class CompletedStory extends Story{
    
    private String imgPath;
    private Advert advert;
    
    
    public CompletedStory(int id, String title, String topic, String content, String imgPath, Advert advert) {
        super(id, title, topic, content);
        this.imgPath = imgPath;
        this.advert = advert;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Advert getAdvert() {
        return advert;
    }

    public void setAdvert(Advert advert) {
        this.advert = advert;
    }
    
}
