package DesignPattern.StructuralPattern.Composite;

public class TaskService {

    private final Task project;

    public TaskService(Task project) {
        this.project = project;
    }

    public void executeProject() {
        project.execute();
    }
}