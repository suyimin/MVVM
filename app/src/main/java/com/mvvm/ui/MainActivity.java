package com.mvvm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;

import com.mvvm.R;


public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //不显示返回按钮
            actionBar.setDisplayHomeAsUpEnabled(false);
        }
    }

    public void simpleSample(View view) {
        launchActivity(DataBindSimpleActivity.class);
    }

    public void observableSample(View view) {
        UpdateUserActivity.launch(this);
    }

    public void dataBindingList(View view) {
        GitHubContributorsActivity.launch(this);
    }

    public void elSample(View view) {
        ELActivity.launch(this);
    }

    public void converter(View view) {
        Intent intent = new Intent(this, ConverterActivity.class);
        startActivity(intent);
    }

    public void customSetter(View view) {
        Intent intent = new Intent(this, CustomSetterActivity.class);
        startActivity(intent);
    }

    public void searchDebounce(View view) {
        Intent intent = new Intent(this, SearchDebounceActivity.class);
        startActivity(intent);
    }
}
