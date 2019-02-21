package com.example.dagger2app.activity;

import android.app.Application;
import android.graphics.ColorSpace;
import android.util.Log;
import android.widget.TextView;

import com.example.dagger2app.BuildConfig;
import com.example.dagger2app.R;
import com.example.dagger2app.model.Model;
import com.example.dagger2app.model.ModelManager;
import com.example.dagger2app.model.RestService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MyApplication extends Application {

    Gson gson;
    GsonConverterFactory gsonConverterFactory;
    Retrofit retrofit;
    ModelManager manager;


    @Override
    public void onCreate() {
        super.onCreate();

        gson  =new GsonBuilder().create();
        gsonConverterFactory = GsonConverterFactory.create(gson);
        retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .build();

        manager = new ModelManager();
        final RestService restService = manager.getService(retrofit);


        Call<List<Model>> call = restService.getModel();

        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {

                List<Model> news = response.body();
                for (Model model : news) {

                    Log.d("response = data", "onResponse: key " + model.getTitle());
                    Log.d("response = data", "onResponse: id"+model.getSubTitle());
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {

            }
        });
    }

}
