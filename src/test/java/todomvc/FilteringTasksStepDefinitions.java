package todomvc;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import todomvc.model.TodoStatusFilter;
import todomvc.tasks.CompleteItem;
import todomvc.tasks.FilterItems;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FilteringTasksStepDefinitions {

    @Given("^s?he has completed the task called '(.*)'$")
    public void she_has_completed_the_task_called(String task) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                CompleteItem.called(task)
        );
    }

    @When("^s?he filters her list to show only (.*) tasks$")
    public void she_filters_her_list_to_show_only_tasks(TodoStatusFilter status) throws Exception {
        theActorInTheSpotlight().attemptsTo(FilterItems.toShow(status));
    }
}
