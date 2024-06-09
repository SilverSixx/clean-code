package DesignPattern.BehavioralPattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorMemento> states;

    public History() {
        this.states = new ArrayList<>();
    }

    public void push(EditorMemento memento) {
        states.add(memento);
    }

    public EditorMemento pop() {
        if (states.isEmpty()) {
            return null;
        }
        int lastIndex = states.size() - 1;
        EditorMemento lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }
}

