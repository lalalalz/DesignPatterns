package Interpreter.after;

import java.util.Map;

public interface PostFixExpression {
    int interpret(Map<Character, Integer> context);
}
