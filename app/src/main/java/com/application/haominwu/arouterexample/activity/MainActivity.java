package com.application.haominwu.arouterexample.activity;

import android.content.Intent;
import android.net.Uri;

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

    @OnClick(R.id.btn_load_url)
    public void loadURL() {
        Intent intent = new Intent(Intent.ACTION_VIEW); //Intent.ACTION_VIEW固定写法
        intent.setData(Uri.parse("arouter://whm/activity/hello")); //url是你要跳转的网页地址
        startActivity(intent);
    }

    @Override
    public int getContentLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void init(Intent intent) {
        if (intent != null) {
            Uri uri = intent.getData();
            if (uri != null) {
                ARouter.getInstance().build(uri).navigation();
            }
        }

    }

}
