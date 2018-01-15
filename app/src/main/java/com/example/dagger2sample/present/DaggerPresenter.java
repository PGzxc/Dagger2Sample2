package com.example.dagger2sample.present;

import com.example.dagger2sample.DaggerActivity;
import com.example.dagger2sample.bean.User;

/**
 * Created by admin on 2018/1/14.
 */

public class DaggerPresenter {
    DaggerActivity activity;
    User user;

    public DaggerPresenter(DaggerActivity activity, User user) {
        this.activity = activity;
        this.user = user;
    }
    public void showUserName() {
        activity.showUserName(user.name);
    }
}
