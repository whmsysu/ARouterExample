package com.application.haominwu.httplibrary.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {

    private static List<Activity> activities = new ArrayList<>();

    /**
     *
     * @param activity
     */
    public static void pushActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     *
     * @param activity
     */
    public static void popActivity(Activity activity) {
       activities.remove(activity);
    }

    /**
     *
     */
    public static void clearAllActivities() {
       activities.clear();
    }

    /**
     *
     * @return
     */
    public static Activity getTopActivity() {
        return activities.get(activities.size() - 1);
    }

}
