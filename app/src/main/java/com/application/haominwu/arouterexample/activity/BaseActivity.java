package com.application.haominwu.arouterexample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.application.haominwu.httplibrary.util.ActivityCollector;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentLayout());
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        ActivityCollector.pushActivity(this);
        Intent intent = getIntent();
        init(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.popActivity(this);
    }

    public abstract @LayoutRes int getContentLayout();

    public void init(Intent intent) {

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        init(intent);
    }
}
