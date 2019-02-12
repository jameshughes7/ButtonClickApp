package com.example.jameshughes.buttonclickapp.cucumber.espresso.buttonClick

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import com.example.jameshughes.buttonclickapp.MainActivity
import com.example.jameshughes.buttonclickapp.R
import org.hamcrest.CoreMatchers.containsString

class ButtonClickRobot {

    fun launchButtonClickApp(testRule: ActivityTestRule<MainActivity>) {
        testRule.launchActivity(null)
    }

    fun clickCounterButton() {
        onView(withId(R.id.button)).perform(click())
    }

    fun viewButtonCounts() {
        onView(withId(R.id.textView))
            .perform(ViewActions.typeText("James"))
            .check(
            matches(
                withText(containsString("James"))
            )
        )
    }
}