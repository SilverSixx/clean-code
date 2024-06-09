package DesignPattern.BehavioralPattern.Memento;

public class TextEditor {
    private StringBuilder content;

    public TextEditor() {
        this.content = new StringBuilder();
    }

    public void type(String text) {
        content.append(text);
    }

    public String getContent() {
        return content.toString();
    }

    public EditorMemento save() {
        return new EditorMemento(content.toString());
    }

    public void restore(EditorMemento memento) {
        this.content = new StringBuilder(memento.getContent());
    }
}

