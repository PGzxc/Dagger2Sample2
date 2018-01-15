package com.example.dagger2sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.dagger2sample.component.DaggerActivityComponent;
import com.example.dagger2sample.module.ActivityModule;
import com.example.dagger2sample.present.DaggerPresenter;
import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {
    private static final String TAG = "DaggerActivity";
    TextView tvContent;

    @Inject
    DaggerPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvContent = findViewById(R.id.tvContent);
        inject();
        presenter.showUserName();
    }
    private void inject() {
        DaggerActivityComponent.builder().activityModule(new ActivityModule(this))
                .build().inject(this);
    }
    public void showUserName(String name) {
        tvContent.setText(name);
    }
}
