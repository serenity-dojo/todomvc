package todomvc.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import todomvc.ui.ApplicationHomePage;

import java.util.List;

public class Start {

    public static Performable withAnEmptyList() {
        return Instrumented.instanceOf(StartWithAnEmptyList.class).newInstance();
    }

    public static Performable withATodoListOf(List<String> tasks) {
        return Instrumented.instanceOf(StartWithAPopulatedList.class).withProperties(tasks);
    }
}
