package com.omrbranch.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@LoginHotel"),features="src/test/resources/Features",glue="")
public class TestRunnerClass {

}

//tags="LoginPage"