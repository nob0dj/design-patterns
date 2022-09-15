package com.sh.singleton.thread_safe;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
		
	}

	/**
	 * synchronized keyword를 사용해서 한번에 한 thread만 method를 호출 할 수 있도록 한다.
	 * synchronized block을 사용한 것보다는 효윻적이지 않다.
	 * 
	 * @return
	 */
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	/**
	 * 최초 객체 생성시만 thread-safety를 보장하면 되므로 synchronized block을 사용했다.
	 * @return
	 */
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	    if(instance == null){
	    	/**
	    	 * static method이므로 this를 critical section으로 지정할 수 없다.
	    	 * Cannot use this in a static context
	    	 */
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingleton();
	            }
	        }
	    }
	    return instance;
	}

}