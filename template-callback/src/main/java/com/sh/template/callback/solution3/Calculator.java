package com.sh.template.callback.solution3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;

public class Calculator {
    Logger logger = Logger.getLogger(getClass());

    public int calcSum(String filepath) throws IOException {
        int initVal = 0;
        return calcTemplate(filepath, initVal, new ICalcCallback<Integer>() {

            @Override
            public Integer doCalc(String line, Integer result) {
                return result + Integer.valueOf(line);
            }
        });
    }

    public int calcMultiply(String filepath) throws IOException {
        int initVal = 1;
        return calcTemplate(filepath, initVal, new ICalcCallback<Integer>() {

            @Override
            public Integer doCalc(String line, Integer result) {
                return result * Integer.valueOf(line);
            }

        });
    }

    public String concat(String filepath) throws IOException {
        String initVal = "";
        return calcTemplate(filepath, initVal, new ICalcCallback<String>() {

            @Override
            public String doCalc(String line, String result) {
                return result + line;
            }

        });
    }

    private <T> T calcTemplate(String filepath, T initVal, ICalcCallback<T> cb) throws IOException {
       T result = initVal;

        try (BufferedReader br = new BufferedReader(new FileReader(filepath));){
            String line = null;
            while ((line = br.readLine()) != null) {
                result = cb.doCalc(line, result);
            }
            return result;

        } catch (IOException e) {
            logger.error("{}", e);
            throw e;
        }
    }
}
