package com.application.haominwu.arouterexample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.application.haominwu.arouterexample.activity.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class ArouterTest {

    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void helloButtonTest() {
        onView(withId(R.id.btn_hello)).perform(click());
        onView(withId(R.id.tv_welcome)).check(matches(withText("Hello, Mike!!!")));
    }

    @Test
    public void helloGoodByeTest() {
        onView(withId(R.id.btn_goodbye)).perform(click());
        onView(withId(R.id.tv_welcome)).check(matches(withText("GoodBye!!!")));
    }

    @Test
    public void loadURLTest() {
        onView(withId(R.id.btn_load_url)).perform(click());
        onView(withId(R.id.tv_welcome)).check(matches(withText("Hello!!!")));
    }
}
