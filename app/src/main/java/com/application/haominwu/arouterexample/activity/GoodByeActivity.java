package com.application.haominwu.arouterexample.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.application.haominwu.arouterexample.R;

@Route(path = "/activity/goodbye")
public class GoodByeActivity extends BaseActivity {

    @Override
    public int getContentLayout() {
        return R.layout.activity_good_bye;
    }
}
