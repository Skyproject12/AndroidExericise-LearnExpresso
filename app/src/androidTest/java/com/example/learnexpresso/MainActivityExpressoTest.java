package com.example.learnexpresso;



import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityExpressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void ensureTextChangeWork(){
        // ketika suatu edittext menginputkan hello
        onView(withId(R.id.inpu_text)).perform(typeText("Hello"), closeSoftKeyboard());
        // lalu klik button switch
        onView(withId(R.id.button_switch)).perform(click());
        // maka harusnya menghasilkan hello dalam text
        onView(withId(R.id.text_result)).check(matches(withText("Hello")));
    }
    @Test
    public void ensureMoveActivityWithData(){
        onView(withId(R.id.inpu_text)).perform(typeText("DicodingMenjadiAndroidDeveloperExpert"), closeSoftKeyboard());
        onView(withId(R.id.button_switch)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("DicodingMenjadiAndroidDeveloperExpert")));
    }
}