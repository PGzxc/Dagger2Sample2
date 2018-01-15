package com.example.dagger2sample.component;

import com.example.dagger2sample.DaggerActivity;
import com.example.dagger2sample.module.ActivityModule;

import dagger.Component;

/**
 * Created by admin on 2018/1/14.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(DaggerActivity daggerActivity);
}
