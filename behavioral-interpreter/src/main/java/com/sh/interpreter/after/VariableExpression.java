package com.sh.interpreter.after;

import java.util.Map;

/**
 * TerminalExpression
 * - 숫자에 대한 표현식
 */
public class VariableExpression implements PostfixExpression{

    private Character variable;

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(variable);
    }

    public VariableExpression(Character variable) {
        this.variable = variable;
    }
}
