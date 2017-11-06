package todomvc;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import todomvc.steps.TodoListUser;

public class AddNewTasksStepDefinitions {

    @Steps
    TodoListUser james;

    @Given("^that James has an empty todo list$")
    public void that_James_has_an_empty_todo_list() throws Exception {
        james.startsWithAnEmptyTodoList();
    }

    @When("^he adds '(.*)' to his list$")
    public void he_adds_to_his_list(String taskName) throws Exception {
        james.adds_a_task(taskName);
    }

    @Then("^'(.*)' should be recorded in his list$")
    public void should_be_recorded_in_his_list(String taskName) throws Exception {
        james.should_see_task(taskName);
    }

}
