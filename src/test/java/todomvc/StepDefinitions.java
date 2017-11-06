package todomvc;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
    @Given("^I am thirsty$")
    public void i_am_thirsty() throws Throwable {
    }

    @When("^I order a cappuccino$")
    public void i_order_a_cappuccino() throws Throwable {
    }

    @Given("^Cathy is (\\d+) meters from the coffee shop$")
    public void cathyIsMetersFromTheCoffeeShop(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Cathy orders a large cappuccino$")
    public void cathyOrdersALargeCappuccino() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Barry should receive the order$")
    public void barryShouldReceiveTheOrder() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Barry should know that he must make the coffee straight away$")
    public void barryShouldKnowThatHeMustMakeTheCoffeeStraightAway() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}    