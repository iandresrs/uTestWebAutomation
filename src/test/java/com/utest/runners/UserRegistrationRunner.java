package com.utest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/resources/features/userRegistration.feature",
        glue = "com.utest.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@UserRegistration"

)
public class UserRegistrationRunner {
}
