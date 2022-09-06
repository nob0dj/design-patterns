package com.sh.template.callback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;

public class Calculator {
	Logger logger = Logger.getLogger(getClass());
	
	public int calcSum(String filepath) throws IOException{
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader(filepath));
			int sum = 0;
			String line = null;
			while((line=br.readLine())!=null){
				sum += Integer.valueOf(line);
			}
				
			return sum;
		} catch(IOException e){
			logger.debug(e.getMessage());
			throw e;
		} finally {
			if(br!=null){
				try{
					br.close();
				} catch(IOException e){
					logger.debug(e.getMessage());
				}
			}
		}
		
	}
	
	public int calcMultiply(String filepath) throws IOException{
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader(filepath));
			int result = 1;
			String line = null;
			while((line=br.readLine())!=null){
			    result *= Integer.valueOf(line);
			}
				
			return result;
		} catch(IOException e){
			logger.debug(e.getMessage());
			throw e;
		} finally {
			if(br!=null){
				try{
					br.close();
				} catch(IOException e){
					logger.debug(e.getMessage());
				}
			}
		}
		
	}
}
