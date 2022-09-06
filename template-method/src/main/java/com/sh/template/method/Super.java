package com.sh.template.method;

public abstract class Super {

	/**
	 * 기본 알고리즘 메소드
	 */
	public void templateMethod() {
		a();
		b();
	}
	
	/**
	 * hook method 1
	 * subclass 구현 강제화
	 */
	public abstract void a();
	
	
	/**
	 * hook method 2
	 * subclass에서 선택적으로 구현
	 */
	public void b() {
		System.out.println("Super에서 정의된 b메소드");
	}

}
