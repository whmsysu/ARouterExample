package com.application.haominwu.arouterexample.activity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.application.haominwu.arouterexample.R;

import butterknife.OnClick;


public class MainActivity extends BaseActivity {

    @OnClick(R.id.btn_hello)
    public void hello() {
        ARouter.getInstance().build("/activity/hello").withCharSequence("name", "Mike").navigation();
    }

    @OnClick(R.id.btn_goodbye)
    public void goodbye() {
        ARouter.getInstance().build("/activity/goodbye").navigation();
    }


    @Override
    public int getContentLayout() {
        return R.layout.activity_main;
    }
}
