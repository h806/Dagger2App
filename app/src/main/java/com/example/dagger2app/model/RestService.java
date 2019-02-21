package com.example.dagger2app.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestService {

    @GET("json_bangla")
    Call<List<Model>> getModel();
}
