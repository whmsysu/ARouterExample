package com.application.haominwu.arouterexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.application.haominwu.arouterexample.R;

@Route(path = "/activity/hello")
public class HelloActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        ARouter.getInstance().inject(this);
    }
}
