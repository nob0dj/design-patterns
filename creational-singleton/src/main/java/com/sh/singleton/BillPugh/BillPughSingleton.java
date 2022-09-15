package com.sh.singleton.BillPugh;

public class BillPughSingleton {

	private BillPughSingleton() {
		
	}

	/**
	 * jdk1.5이전의 불안정한 memory 상황을 해결하기 위해 (thread-safe한 pattern 또한  많은 thread 동시 접근하는 특정경우에 실패했다고한다.)방식으로 Bill Pugh가 고안한 방식
	 * static inner class의 field로 외부클래스 객체를 선언하였다.
	 */
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}