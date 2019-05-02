package com.romanov.rest;

import com.google.gson.Gson;
import com.romanov.model.Advert;
import com.romanov.model.Company;
import com.romanov.model.CompletedStory;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/tools")
public class StoryTools {
    
    //test data for completed stories
    private static Company company1 = new Company(1, "Company1", "Tom", "Smith", "email", "tel");
    private static Advert advert1 = new Advert(1, "Advert1", "Content1", "Medium", company1);
    private static Advert advert2 = new Advert(2, "Advert2", "Content2", "Small", company1);
  
    private static CompletedStory completedStory1 = new CompletedStory(1, "Story1", "Topic1", "Content1", "images/storiesImg/story1.jpg", advert1);
    private static CompletedStory completedStory2 = new CompletedStory(2, "Story2", "Topic2", "Content2", "images/storiesImg/story2.jpg", advert1);
    private static CompletedStory completedStory3 = new CompletedStory(3, "Story3", "Topic3", "Content3", "images/storiesImg/story3.jpg", advert2);
    
    private static CompletedStory[] completedStoriesArray = {completedStory1, completedStory2, completedStory3};
    
    @GET
    @Path("completed/stories")
    @Produces({"application/json"})
    public String getCompletedStories() {
        
        Gson gson = new Gson();
        String jsonCompletedStories = gson.toJson(completedStoriesArray);
        
        return jsonCompletedStories;
    }
}
