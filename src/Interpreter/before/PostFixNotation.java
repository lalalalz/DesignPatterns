package Interpreter.before;

import java.util.Stack;

public class PostFixNotation {

    private final String expression;

    public PostFixNotation(String expression) {
        this.expression = expression;
    }

    public static void main(String[] args) {
        PostFixNotation postFixNotation = new PostFixNotation("123+-");
        postFixNotation.caculate();
    }

    private void caculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    numbers.push(-numbers.pop() + numbers.pop());
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
        }

        System.out.println(numbers.pop());
    }
}
