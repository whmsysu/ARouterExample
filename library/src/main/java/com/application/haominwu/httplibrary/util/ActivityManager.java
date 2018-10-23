package com.application.haominwu.httplibrary.util;

import android.app.Activity;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class ActivityManager {

    private static WeakHashMap<Activity, Object> weakHashMap = new WeakHashMap<>();
    private static WeakReference<Activity> topActivityRef;


    /**
     * @param activity
     */
    public static void pushActivity(Activity activity) {
        weakHashMap.put(activity, null);
        topActivityRef = new WeakReference<>(activity);
    }

    /**
     * @param activity
     */
    public static void popActivity(Activity activity) {
        weakHashMap.remove(activity);
    }

    /**
     *
     */
    public static void clearAllActivities() {
        for (Activity activity : weakHashMap.keySet()) {
            activity.finish();
        }
        weakHashMap.clear();
    }

    /**
     * @return
     */
    public static WeakReference<Activity> getTopActivity() {
        return topActivityRef;
    }

}
