package com.sh.singleton.serialization;

import java.io.Serializable;

/**
 * 
 * Bill Pugh방식의 singleton
 *
 */
public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
    /**
     * ObjectInputStream의 readObject()메소드 내부적으로 호출된다.
     * @Override 사용불가
     * 
     * @return
     */
    protected Object readResolve() {
//    	return new SerializedSingleton();
        return getInstance();
    }
}