package Interpreter.after;

import java.util.Map;

public class PlusExpression implements PostFixExpression {

    private PostFixExpression left, right;

    public PlusExpression(PostFixExpression left, PostFixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
