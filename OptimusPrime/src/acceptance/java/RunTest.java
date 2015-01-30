package com.mycompany.webapp.feature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber"})
public class RunTest {
}