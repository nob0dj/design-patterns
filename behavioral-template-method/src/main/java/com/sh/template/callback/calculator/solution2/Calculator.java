package com.sh.template.callback.calculator.solution2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class Calculator {

	public int calcSum(String filepath) throws IOException{
		int initVal = 0;
		return calcTemplate(filepath, initVal, new ICalcCallback() {
			@Override
			public int doCalc(String line, int result) {
				return result+Integer.valueOf(line);
			}
		});
	}
	
	public int calcMultiply(String filepath) throws IOException{
		int initVal = 1;
		return calcTemplate(filepath, initVal, new ICalcCallback() {
			@Override
			public int doCalc(String line, int result) {
				return result*Integer.valueOf(line);
			}
		});
	}
	
	private int calcTemplate(String filepath, int initVal, ICalcCallback cb) throws IOException{
		int result = initVal;
		
		try(BufferedReader br = new BufferedReader(new FileReader(filepath));){
			String line = null;
			while((line=br.readLine())!=null){
				result = cb.doCalc(line, result);
			}
			return result;
			
		} catch(IOException e){
			throw e;
		}
	}
}
