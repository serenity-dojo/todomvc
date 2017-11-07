package todomvc.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import todomvc.ui.ApplicationHomePage;

import java.util.List;

public class StartWithAPopulatedList implements Performable {

    private ApplicationHomePage applicationHomePage;

    private final List<String> tasks;

    public StartWithAPopulatedList(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    @Step("{0} starts with an empty list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(applicationHomePage),
                AddTodoItems.called(tasks)
        );
    }
}
