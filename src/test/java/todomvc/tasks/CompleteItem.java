package todomvc.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import todomvc.ui.TodoList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteItem implements Task {

    private final String name;

    @Override
    @Step("{0} completes the item called: #itemName")
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Click.on(TodoList.COMPLETE_TASK.of(name))
        );
    }

    public static CompleteItem called(String name) {
        return instrumented(CompleteItem.class, name);
    }
    public CompleteItem(String name) { this.name = name; }

}
