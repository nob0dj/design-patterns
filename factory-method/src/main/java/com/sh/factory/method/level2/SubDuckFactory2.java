package com.sh.factory.method.level2;

import space.shqkel.design.pattern.factory.method.level1.Duck;

public class SubDuckFactory2 extends SuperDuckFactory {

	@Override
	public Duck createDuck(int type) {
		switch(type) {
		case 1 : return new DonarldDuck();  
		case 2 : return new KakaoTube();
		case 3 : 		
		default: return new GorapaDuck();
		}
	}

}


class DonarldDuck extends Duck {
	
}

class KakaoTube extends Duck {
	
}

class GorapaDuck extends Duck {
	
}