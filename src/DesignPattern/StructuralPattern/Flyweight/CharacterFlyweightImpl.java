package DesignPattern.StructuralPattern.Flyweight;

public class CharacterFlyweightImpl implements CharacterFlyweight{

    private final char character;

    public CharacterFlyweightImpl(char character) {
        this.character = character;
    }

    @Override
    public void printCharacter(int size, String color) {
        System.out.println("Character: " + character + ", Size: " + size + ", Color: " + color);
    }
}
