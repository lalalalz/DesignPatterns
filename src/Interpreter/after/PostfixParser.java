package Interpreter.after;

import java.util.Stack;

public class PostfixParser {

    public static PostFixExpression parse(String expression) {
        Stack<PostFixExpression> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }

        return stack.pop();
    }

    private static PostFixExpression getExpression(char c, Stack<PostFixExpression> stack) {

        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                return new MinusExpression(stack.pop(), stack.pop());
            default:
                return new VariableExpression(c);
        }
    }
}
