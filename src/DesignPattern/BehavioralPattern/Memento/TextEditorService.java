package DesignPattern.BehavioralPattern.Memento;

public class TextEditorService {

    private final TextEditor textEditor;
    private final History history;

    public TextEditorService(TextEditor textEditor, History history) {
        this.textEditor = textEditor;
        this.history = history;
    }

    public void typeText(String text) {
        textEditor.type(text);
    }

    public String getContent() {
        return textEditor.getContent();
    }

    public void save() {
        history.push(textEditor.save());
    }

    public void undo() {
        EditorMemento memento = history.pop();
        if (memento != null) {
            textEditor.restore(memento);
        }
    }
}

