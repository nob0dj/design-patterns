package com.sh.singleton.enum_;

public class EnumSingletonRun {

	public static void main(String[] args) {
		EnumSingleton instance1 = EnumSingleton.INSTANCE;
		EnumSingleton instance2 = EnumSingleton.INSTANCE;
		System.out.println(instance1 == instance2);
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		instance1.doSomething(); // The static method doSomething() from the type EnumSingleton should be accessed in a static way
		
		EnumSingleton.doSomething();
	}

}
