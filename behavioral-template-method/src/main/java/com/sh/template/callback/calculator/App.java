package com.sh.template.callback.calculator;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();
        String filepath = "number.txt";
        System.out.println(calc.calcSum(filepath));
        System.out.println(calc.calcMultiply(filepath));
    }
}
