package todomvc.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import todomvc.ui.TodoList;

import java.util.List;

public class AddTodoItems implements Task {

    private final List<String> thingsToDo;

    public AddTodoItems(List<String> thingsToDo) {
        this.thingsToDo = thingsToDo;
    }

    @Override
    @Step("{0} adds a todo item called #thingToDo")
    public <T extends Actor> void performAs(T actor) {
        thingsToDo.forEach(
                task -> actor.attemptsTo(AddATodoItem.called(task))
        );
    }

    public static Performable called(List<String> thingsToDo) {
        return Instrumented.instanceOf(AddTodoItems.class).withProperties(thingsToDo);
    }
}
