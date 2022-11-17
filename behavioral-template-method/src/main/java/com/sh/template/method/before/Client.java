package com.sh.template.method.before;

public class Client {

    public static void main(String[] args) {
        SumFileProcessor sumFileProcessor = new SumFileProcessor("number.txt");
        int result = sumFileProcessor.process();
        System.out.println(result);

        MultiplyFileProcessor multiplyFileProcessor = new MultiplyFileProcessor("number.txt");
        result = multiplyFileProcessor.process();
        System.out.println(result);
    }
}
