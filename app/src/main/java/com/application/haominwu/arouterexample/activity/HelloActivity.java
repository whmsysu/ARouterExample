package com.application.haominwu.arouterexample.activity;

import android.content.Intent;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.application.haominwu.arouterexample.R;
import com.orhanobut.logger.Logger;

import butterknife.BindView;

@Route(path = "/activity/hello")
public class HelloActivity extends BaseActivity {

    @Autowired
    public String name;

    @BindView(R.id.tv_welcome)
    public TextView textViewWelcome;

    @Override
    public int getContentLayout() {
        return R.layout.activity_hello;
    }

    @Override
    public void init(Intent intent) {
        if (name !=null && !name.equals("")) textViewWelcome.setText(String.format("Hello, %s!!!", name));
        else textViewWelcome.setText("Hello!!!");
    }

}
