package com.sh.template.method.after;


import com.sh.template.method.before.MultiplyFileProcessor;

public class Client {

    public static void main(String[] args) {
        FileProcessor sumFileProcessor = new SumFileProcessor("number.txt");
        int result = sumFileProcessor.process();
        System.out.println(result);

        MultiplyFileProcessor multiplyFileProcessor = new MultiplyFileProcessor("number.txt");
        result = multiplyFileProcessor.process();
        System.out.println(result);

    }
}
