package Interpreter.after;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        PostFixExpression expression = PostfixParser.parse("xyz+-");
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);
    }
}
