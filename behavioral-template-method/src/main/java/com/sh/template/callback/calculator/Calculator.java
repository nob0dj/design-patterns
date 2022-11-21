package com.sh.template.callback.calculator;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    public int calcSum(String filepath) {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filepath));) {
            String line = null;
            while ((line = br.readLine()) != null) {
                sum += Integer.valueOf(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public int calcMultiply(String filepath) {
        int result = 1;
        try (BufferedReader br = new BufferedReader(new FileReader(filepath));) {
            String line = null;
            while ((line = br.readLine()) != null) {
                result *= Integer.valueOf(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
