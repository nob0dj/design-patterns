package com.sh.interpreter.after.simple;


import java.util.Map;

public class App {
    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-a+");
        Map<Character, Integer> context = Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4);
        int result = expression.interpret(context);
        System.out.println(result);
    }
}
