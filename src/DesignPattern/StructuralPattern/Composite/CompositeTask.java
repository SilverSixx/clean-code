package DesignPattern.StructuralPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task {
    private String name;
    private List<Task> subTasks = new ArrayList<>();

    public CompositeTask(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        subTasks.add(task);
    }

    public void removeTask(Task task) {
        subTasks.remove(task);
    }

    @Override
    public void execute() {
        System.out.println("Executing composite task: " + name);
        for (Task task : subTasks) {
            task.execute();
        }
    }
}

