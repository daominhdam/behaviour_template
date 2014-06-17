package com.rhino.auto;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"pretty", "html:target/cucumber-html-report"}
		,features={"src/test/resources/"}
		)

public class RunCukesTest {
// And I click on the check button
}