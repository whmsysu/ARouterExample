package com.application.haominwu.arouterexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.application.haominwu.arouterexample.R;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.btn_hello)
    public void hello() {
        ARouter.getInstance().build("/activity/hello").navigation();
    }

    @OnClick(R.id.btn_goodbye)
    public void goodbye() {
        ARouter.getInstance().build("/activity/goodbye").navigation();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
