package com.sh.factory.method.level2;

import com.sh.factory.method.level1.Duck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Run r = new Run();
		r.test1();
		r.test2();
		
	}

	/**
	 * 오리 캐릭터 버젼
	 * SubDucFactory2 의 createDuck Override
	 * 
	 */
	private void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오리 캐릭터 선택 (1.도날드덕 2.카카오튜브 3.고라파덕) : ");
		int type = sc.nextInt();
		
		SuperDuckFactory factory = new SubDuckFactory2();
		Duck duck = factory.createDuck(type);
		System.out.println(duck);
		
	}

	/**
	 * 덕후 타입
	 * SubDucFactory1 의 createDuck Override
	 */
	private void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("덕후타입 선택 (1.밀덕 2.겜덕 3.차덕) : ");
		int type = sc.nextInt();
		
		SuperDuckFactory factory = new SubDuckFactory1();
		Duck duck = factory.createDuck(type);
		System.out.println(duck);
		
	}
	
	

}
