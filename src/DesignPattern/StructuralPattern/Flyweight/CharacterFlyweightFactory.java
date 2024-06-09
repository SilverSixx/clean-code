package DesignPattern.StructuralPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {
    private final Map<Character, CharacterFlyweight> flyweights = new HashMap<>();

    public CharacterFlyweight getCharacterFlyweight(char character) {
        CharacterFlyweight flyweight = flyweights.get(character);
        if (flyweight == null) {
            flyweight = new CharacterFlyweightImpl(character);
            flyweights.put(character, flyweight);
        }
        return flyweight;
    }
}

