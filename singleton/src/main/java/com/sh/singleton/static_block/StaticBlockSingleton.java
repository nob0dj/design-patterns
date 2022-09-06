package com.sh.singleton.static_block;


/**
 * 
 * static field의 초기화는 static초기화 블럭에서 진행.
 * 예외처리가 가능하다.
 *
 */
public class StaticBlockSingleton {

	private static final StaticBlockSingleton instance;

	private StaticBlockSingleton() {
		
	}

	/**
	 * static block initialization for exception handling
	 */
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}