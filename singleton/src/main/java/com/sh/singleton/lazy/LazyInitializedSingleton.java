package com.sh.singleton.lazy;

public class LazyInitializedSingleton {

	/**
	 * 이때는 final keyword를 사용할 수 없다.
	 */
	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
		
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}