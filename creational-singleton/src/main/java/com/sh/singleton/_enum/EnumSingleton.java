package com.sh.singleton._enum;

/**
 * 
 * java에서 enum값은 단한번만 객체화 할 수 있다.
 * reflection등 singleton 무력화등을 방어하기 위해 Joshua Bloch가 제안한 방법
 * 단, lazy initialization은 사용할 수 없다.
 *
 */
public enum EnumSingleton {

    INSTANCE;
    
    public static void doSomething(){
        //do something
    	System.out.println(INSTANCE);
    }
}