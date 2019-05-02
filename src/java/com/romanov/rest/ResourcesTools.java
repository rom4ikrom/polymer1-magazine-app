package com.romanov.rest;

import com.google.gson.Gson;
import com.romanov.model.Advert;
import com.romanov.model.Journalist;
import com.romanov.model.Article;
import com.romanov.model.Company;
import com.romanov.model.Photo;
import com.romanov.model.Photographer;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/tools/resources")
public class ResourcesTools {
    
    //test data for articles
    private static Journalist journalist1 = new Journalist(1, "Tom", "Smith", "tom.smith@gmail.com", "12345");
    private static Journalist journalist2 = new Journalist(2, "Bill", "White", "bill.white@gmail.com", "12345");
    
    private static Article article1 = new Article(1, "Title1", "Topic1", "Content1", journalist1, "02/05/2019");
    private static Article article2 = new Article(2, "Title2", "Topic2", "Content2", journalist1, "03/05/2019");
    private static Article article3 = new Article(3, "Title3", "Topic3", "Content3", journalist2, "04/05/2019");
    
    private static Article[] articles = {article1, article2, article3};
    
    //test data for photos
    private static Photographer photographer1= new Photographer(1, "Sam", "Brown", "sam.brown@gmail.com", "12345");
    private static Photographer photographer2 = new Photographer(2, "Rob", "Smith", "rob.smith@gmail.com", "12345");
    
    private static Photo photo1 = new Photo(1, photographer1, "images/photosImg/ps4_1.jpg", "02/05/2019");
    private static Photo photo2 = new Photo(2, photographer1, "images/photosImg/ps4_2.jpg", "03/05/2019");
    private static Photo photo3 = new Photo(3, photographer2, "images/photosImg/ps4_3.jpg", "02/05/2019");
    private static Photo photo4 = new Photo(4, photographer2, "images/photosImg/ps4_4.jpg", "03/05/2019");
    private static Photo photo5 = new Photo(5, photographer2, "images/photosImg/xbox1_1.jpg", "04/05/2019");
    
    private static Photo[] photos = {photo1, photo2, photo3, photo4, photo5};
    
    //test data for adverts
    private static Company company1 = new Company(1, "Company1", "Tom", "Smith", "email", "tel");
    
    private static Advert advert1 = new Advert(1, "Advert1", "Content1", "Medium", company1);
    private static Advert advert2 = new Advert(2, "Advert2", "Content2", "Small", company1);
    
    private static Advert[] adverts = {advert1, advert2};
    
    @GET
    @Path("/articles")
    @Produces({ "application/json" }) 
    public String getArticles() {
        
        Gson gson = new Gson();
        String jsonArticles = gson.toJson(articles);
        
        return jsonArticles;
    }
    
    @GET
    @Path("/photos")
    @Produces({ "application/json" }) 
    public String getPhotos() {
        
        Gson gson = new Gson();
        String jsonPhotos = gson.toJson(photos);
        
        return jsonPhotos;
        
    }
    
    @GET
    @Path("/adverts")
    @Produces({ "application/json" }) 
    public String getAdverts() {
        
        Gson gson = new Gson();
        String jsonAdverts = gson.toJson(adverts);
        
        return jsonAdverts;
        
    }
    
}
