package com.ashish.designPattern.creational.singleton;

/**
 * @author ashish 
 *         This method is thread safe Because at the object is created when the class loaded
 *         in JVM . Hence its thread safe .
 */
public class SingleTonWithThreadSafe {
	private static SingleTonWithThreadSafe obj = new SingleTonWithThreadSafe();

	private SingleTonWithThreadSafe() {
	}

	public synchronized SingleTonWithThreadSafe getInstance() {

		return obj;
	}

}
