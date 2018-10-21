package com.application.haominwu.arouterexample.activity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.application.haominwu.arouterexample.R;
import com.orhanobut.logger.Logger;

@Route(path = "/activity/hello")
public class HelloActivity extends BaseActivity {

    @Autowired
    public String name;

    @Override
    public int getContentLayout() {
        return R.layout.activity_hello;
    }

    @Override
    public void init() {
        Logger.d(name);
    }

}
