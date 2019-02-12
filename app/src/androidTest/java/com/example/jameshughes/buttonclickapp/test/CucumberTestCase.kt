package com.example.jameshughes.buttonclickapp.test

import cucumber.api.CucumberOptions

@CucumberOptions(
    features = ["features"],
    glue = ["com.example.jameshughes.buttonclickapp.cucumber.steps"],
    tags = ["@e2e", "@smoke", "@wip"]
    )
@Suppress("unused")
class CucumberTestCase