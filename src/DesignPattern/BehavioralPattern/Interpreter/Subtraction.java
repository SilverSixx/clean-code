package DesignPattern.BehavioralPattern.Interpreter;

public class Subtraction implements Expression {
    private final Expression left;
    private final Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}