package com.application.haominwu.arouterexample.application;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class ArouterExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        if (isDebug()) {           // These two lines must be written before init, otherwise these configurations will be invalid in the init process
//            ARouter.openLog();     // Print log
//            ARouter.openDebug();   // Turn on debugging mode (If you are running in InstantRun mode, you must turn on debug mode! Online version needs to be closed, otherwise there is a security risk)
//        }
        Logger.addLogAdapter(new AndroidLogAdapter());

        ARouter.init(this);
    }
}
