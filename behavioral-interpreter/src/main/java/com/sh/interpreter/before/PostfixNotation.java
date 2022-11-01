package com.sh.interpreter.before;

import java.util.Stack;

public class PostfixNotation {

    private final String expression;

    public PostfixNotation(String expression) {
        this.expression = expression;
    }

    public static void main(String[] args) {
//        PostfixNotation postfixNotation = new PostfixNotation("123+-"); // -4
        PostfixNotation postfixNotation = new PostfixNotation("123+-4+"); // 0
        postfixNotation.calculate();
    }

    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    int right = numbers.pop(); // 우항
                    int left = numbers.pop(); // 좌항
                    numbers.push(left - right);
                    break;
                default:
                    numbers.push(Integer.parseInt(String.valueOf(c)));
            }
        }

        System.out.println(numbers.pop());
    }
}
