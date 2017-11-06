package todomvc.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TodoList extends PageObject {

    @FindBy(css=".new-todo")
    WebElementFacade newTodoField;

    public void addTodo(String taskName) {
    }
}
