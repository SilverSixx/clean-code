package DesignPattern.StructuralPattern.Flyweight;

public class TextEditorService {
    private final CharacterFlyweightFactory flyweightFactory = new CharacterFlyweightFactory();

    public void displayText(String text, int size, String color) {
        for (char c : text.toCharArray()) {
            CharacterFlyweight flyweight = flyweightFactory.getCharacterFlyweight(c);
            flyweight.printCharacter(size, color);
        }
    }
}
