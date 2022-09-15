package com.sh.factory.method.level1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오리타입 선택 (1.고무오리 2.괙괙오리 3.청둥오리 4.랜덤) : ");
		int type = sc.nextInt();
		
		Duck duck = DuckFactory.createDuck(type);
		System.out.println(duck);
	}

}
