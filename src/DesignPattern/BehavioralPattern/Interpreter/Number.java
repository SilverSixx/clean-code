package DesignPattern.BehavioralPattern.Interpreter;

public class Number implements Expression {
    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}

