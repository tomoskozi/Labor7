package com.example.mate.labor7;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by tstorm on 2016.05.22..
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class UITest {

    @Rule
    public ActivityRule<MainActivity> mActivityRule = new ActivityRule(MainActivity.class);

    @Test
    public void btnTest() {
        onView(withId(R.id.btnNext)).perform(click());
        onView(withText("Activity2")).check(ViewAssertions.matches(isDisplayed()));
    }
}
