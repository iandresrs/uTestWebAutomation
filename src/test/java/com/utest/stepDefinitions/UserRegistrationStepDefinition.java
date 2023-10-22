package com.utest.stepDefinitions;

import com.utest.questions.RegistratioValiation;
import com.utest.tasks.UserRegistrationTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class UserRegistrationStepDefinition {

    @Before
    public void Configuration() {
        setTheStage(new OnlineCast());
    }

    @Given("the user is on the website")
    public void theUserIsOnTheWebsite() {
        OnStage.theActorCalled("user")
                .attemptsTo(
                        Open.url("https://utest.com")
                );
    }

    @When("the user fills in the form with his data")
    public void theUserFillsInTheFormWithHisData() {
        OnStage.theActorCalled("user")
                .attemptsTo(
                        UserRegistrationTask.on()
                );
    }

    @Then("the user displays a welcome message")
    public void theUserDisplaysAWellcomeMessage() {
        OnStage.theActorCalled("user")
                .should(seeThat(
                        RegistratioValiation.validation()
                ));
    }
}
