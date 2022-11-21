package com.sh.template.callback.calculator.solution1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;


public class Calculator {

    public int calcSum(String filepath) throws IOException {
        return calcTemplate(filepath, new ICalcCallback() {

            @Override
            public int doCalc(BufferedReader br) throws IOException {
                int result = 0;
                String line = null;
                while ((line = br.readLine()) != null) {
                    result += Integer.valueOf(line);
                }
                return result;
            }
        });
    }

    public int calcMultiply(String filepath) throws IOException {
        return calcTemplate(filepath, new ICalcCallback() {

            @Override
            public int doCalc(BufferedReader br) throws IOException {
                int result = 1;
                String line = null;
                while ((line = br.readLine()) != null) {
                    result *= Integer.valueOf(line);
                }
                return result;
            }
        });
    }

    private int calcTemplate(String filepath, ICalcCallback cb) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filepath));){
            return cb.doCalc(br);
        } catch (IOException e) {
            throw e;
        }
    }
}
