package todomvc.ui;

import net.serenitybdd.screenplay.targets.Target;

public class TodoList {
    public static final Target NEW_TODO = Target.the("New Todo field").locatedBy(".new-todo");
    public static final Target ITEMS = Target.the("Todo items").locatedBy(".todo-list li");
    public static final Target COMPLETE_TASK = Target.the("Complete task tick box")
            .locatedBy("//*[@class='view' and contains(.,'{0}')]//input[@type='checkbox']");;

    public static Target FILTER = Target.the("filter").locatedBy("//*[@class='filters']//a[.='{0}']");
    public static Target SELECTED_FILTER = Target.the("selected filter").locatedBy(".filters a .selected");
}