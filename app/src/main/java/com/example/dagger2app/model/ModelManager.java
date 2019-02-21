package com.example.dagger2app.model;

import retrofit2.Retrofit;

public class ModelManager {
    public   RestService getService(Retrofit retrofit){

        return retrofit.create(RestService.class);
    }
}
