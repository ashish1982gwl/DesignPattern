package com.ashish.designPattern.creational.singleton;

/**  
 * @author ashish
 * This method is thread safe Because two or more thread can enter same time and create 
 *  multiple object, hrnce our purpose not achived  
 */
public class SingleTonWithoutThreadSafe {
	private SingleTonWithoutThreadSafe obj = null;

	private SingleTonWithoutThreadSafe() {
	}

	public SingleTonWithoutThreadSafe getInstance() {
		if (obj == null) {
			obj = new SingleTonWithoutThreadSafe();
		}
		return obj;
	}

}
