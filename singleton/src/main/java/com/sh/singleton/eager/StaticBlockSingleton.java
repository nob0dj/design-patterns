package com.sh.singleton.eager;

/**
 * field로 선언시 객체를 할당하는 스타일
 */
public class StaticBlockSingleton {

	private static final StaticBlockSingleton instance = new StaticBlockSingleton();

	/**
	 *  private constructor to avoid client applications to use constructor
	 */
	private StaticBlockSingleton() {
		
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}