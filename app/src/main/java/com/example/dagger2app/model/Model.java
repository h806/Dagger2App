package com.example.dagger2app.model;

import com.google.gson.annotations.SerializedName;

public class Model {
    String apikey;
    String sessionId;
    String token;



    @SerializedName("name")
    String title;
    @SerializedName("hobby")
    String subTitle;

    public Model(){
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

}
