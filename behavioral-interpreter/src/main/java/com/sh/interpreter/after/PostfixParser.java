package com.sh.interpreter.after;

import java.util.Stack;

public class PostfixParser {
    /**
     * TODO xyz+-
     *  +  z+y   -    -(z+y) x-(z+y)
     * │z│ │ │ │   │ │   │  │   │   │       │
     * │y│ │ │ │z+y│ │   │  │   │   │       │
     * │x│ │x│ │ x │ │ x │  │   │   │x-(z+y)│
     * ┕━┙ ┕━┙ ┕━━━┙ ┕━━━┙ ┕━━━┙   ┕━━━━━━┙
     */
    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for(char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch(c){
            case '+' :
                return new PlusExpression(stack.pop(), stack.pop());
            case '-' :
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            default : // 숫자인 경우
                return new VariableExpression(c);
        }
    }
}
