package com.sh.singleton.destroy.singleton.with.reflection;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		LazyInitializedSingleton instanceOne = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instanceTwo = null;
		try {
			Constructor[] constructors = LazyInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);	// 접근제한자 private 무시하도록함.
				instanceTwo = (LazyInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}

class LazyInitializedSingleton {

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