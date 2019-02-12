//ActivityRule defines
package com.example.jameshughes.buttonclickapp.cucumber.steps

import android.support.test.rule.ActivityTestRule
import com.example.jameshughes.buttonclickapp.MainActivity
import com.example.jameshughes.buttonclickapp.cucumber.espresso.buttonClick.ButtonClickRobot
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class ButtonClickStepDefs {

    private val robot = ButtonClickRobot()

    private val activityRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Given("^I start the application$")
    fun launchButtonClickApp() {
        robot.launchButtonClickApp(activityRule)
    }

    @When("^I click the counter button$")
    fun clickCounterButton() {
        robot.clickCounterButton()
    }

    @Then("^I expect to see the click counts$")
    fun viewButtonCounts() {
        robot.viewButtonCounts()
    }
}
