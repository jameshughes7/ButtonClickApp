package com.example.jameshughes.buttonclickapp

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewAction
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.runner.AndroidJUnit4
import android.support.test.rule.ActivityTestRule
import android.widget.TextView
import org.hamcrest.CoreMatchers.containsString

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)
//    @Test
//    fun useAppContext() {
//        // Context of the app under test.
//        val appContext = InstrumentationRegistry.getTargetContext()
//        assertEquals("com.example.jameshughes.buttonclickapp", appContext.packageName)
//    }

    @Test
    fun tapButtonDisplayed() {
        onView(withId(R.id.button)).check(matches(isDisplayed()))
    }

    @Test
    fun userInputDisplayed() {
        onView(withId(R.id.editText)).check(matches(isDisplayed()))
    }

    @Test
    fun textViewDisplayed() {
        onView(withId(R.id.textView)).check(matches(isDisplayed()))
    }

    @Test
    fun tapButtonClickable() {
        onView(withId(R.id.button)).check(matches(isClickable()))
    }

    @Test
    fun viewButtonClickOutput() {
        onView(withId(R.id.editText)).perform(clearText())
            .perform(typeText("James"))
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText(containsString("James"))))
    }
}
