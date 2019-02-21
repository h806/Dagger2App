package com.example.dagger2app.application;


import com.example.dagger2app.activity.MyApplication;

import dagger.Component;
import retrofit2.Retrofit;

@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MyApplication myApplication);
}
