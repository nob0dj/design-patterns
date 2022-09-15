
package com.sh.template.method;

public class Run {

	public static void main(String[] args) {
		Super sub1 = new Sub1();
		sub1.templateMethod();
		
		Super sub2 = new Sub2();
		sub2.templateMethod();
	}

}
