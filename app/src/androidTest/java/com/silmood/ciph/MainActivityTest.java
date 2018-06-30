package com.silmood.ciph;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule(MainActivity.class);

    @Test
    public void helloWorld_isShown(){
        onView(withText("Hello World!"))
                .check(matches(isDisplayed()));
    }

    @Test
    public void cipher_Rot13(){
        onView(withHint("Message"))
                .check(matches(isDisplayed()))
                .perform(typeText("Hello World!"));

        onView(withText("CIPHER"))
                .check(matches(isDisplayed()))
                .perform(click());

        onView(withText("Uryyb Jbeyq!"))
                .check(matches(isDisplayed()));

    }
}
