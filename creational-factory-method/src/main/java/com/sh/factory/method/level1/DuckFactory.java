package com.sh.factory.method.level1;

public class DuckFactory {

	public static Duck createDuck(int type) {
		
		//4 랜덤을 선택한 경우
		if(type == 4) type = (int)(Math.random() * 3) + 1;
		
		switch(type) {
		case 1 : return new RubberDuck();  
		case 2 : return new QuackDuck();
		case 3 : 
		default: return new MallardDuck();
		}
		
	}
	
}
