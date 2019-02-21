package com.example.dagger2app.activity.di;

import com.example.dagger2app.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ActivityModule {

    @Provides
    Retrofit retrofit(GsonConverterFactory gsonConverterFactory){
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Provides
    GsonConverterFactory gsonConverterFactory(Gson gson){
        return GsonConverterFactory.create(gson);
    }

    @Provides
    Gson gson(){
        GsonBuilder builder = new GsonBuilder();
        return builder.create();
    }
}
