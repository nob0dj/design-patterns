package com.sh.factory.method.level2;

import space.shqkel.design.pattern.factory.method.level1.Duck;

public class SubDuckFactory1 extends SuperDuckFactory {

	@Override
	public Duck createDuck(int type) {
		switch(type) {
		case 1 : return new MilDuck();  
		case 2 : return new GameDuck(); 
		default: return new CarDuck();
		}
	}

}


class MilDuck extends Duck {
	
}

class GameDuck extends Duck {
	
}

class CarDuck extends Duck {
	
}