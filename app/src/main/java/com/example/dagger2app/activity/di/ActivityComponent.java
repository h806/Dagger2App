package com.example.dagger2app.activity.di;

import com.example.dagger2app.application.ApplicationComponent;

import dagger.Component;


@Component(modules ={ActivityModule.class},dependencies = {ApplicationComponent.class})
public interface ActivityComponent {

}
