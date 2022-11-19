package com.sh.template.callback.solution3;


import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();
        String filepath = "number.txt";
        System.out.println(calc.calcSum(filepath)); // 15
        System.out.println(calc.calcMultiply(filepath)); // 120
        System.out.println(calc.concat(filepath)); // 12345
    }
}
