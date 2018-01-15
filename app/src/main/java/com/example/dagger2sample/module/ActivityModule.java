package com.example.dagger2sample.module;

import com.example.dagger2sample.DaggerActivity;
import com.example.dagger2sample.bean.User;
import com.example.dagger2sample.present.DaggerPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2018/1/14.
 */

@Module
public class ActivityModule {
    private DaggerActivity activity;

    public ActivityModule(DaggerActivity activity) {
        this.activity = activity;
    }
    @Provides
    public DaggerActivity provideActivity() {
        return activity;
    }

    @Provides
    public User provideUser() {
        return new User("user form ActivityModule");
    }

    @Provides
    public DaggerPresenter provideDaggerPresenter(DaggerActivity activity, User user) {
        return new DaggerPresenter(activity, user);
    }
}
