package com.sh.template.callback.after;


import com.sh.template.method.before.MultiplyFileProcessor;

public class Client {

    public static void main(String[] args) {
        FileProcessor sumFileProcessor = new FileProcessor("number.txt", 0);
        int result = sumFileProcessor.process(new Operator() {
            @Override
            public int getResult(int result, int n) {
                return result += n;
            }
        });
        System.out.println(result);

        FileProcessor multiplyFileProcessor = new FileProcessor("number.txt", 1);
        result = multiplyFileProcessor.process((product, n) -> product *= n);
        System.out.println(result);

    }
}
