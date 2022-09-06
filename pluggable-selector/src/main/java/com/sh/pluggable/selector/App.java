package com.sh.pluggable.selector;

public class App {

	public static void main(String[] args) {
		new Foo("a").run(); // Foo#a 호출!
		new Bar("b").run(); // Bar#b 호출!
	}

}
