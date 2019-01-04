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

    fun inputText() {
        onView(withId(R.id.editText))
            .perform(ViewActions.clearText())
            .perform(ViewActions.typeText("James"))
    }

    fun clickConfirmationButton() {
        onView(withId(R.id.button)).perform(click())
    }

    fun viewTextOutput() {
        onView(withId(R.id.textView))
            .check(matches(withText(containsString("James")))
        )
    }
}