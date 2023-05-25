package com.ashish.designPattern.creational.singleton;

/**  
 * @author ashish
 * This method is thread safe Because two or more thread can enter same time and create 
 *  multiple object, hrnce our purpose not achived  
 */
public class SingleTonEger {
	private SingleTonEger obj = null;

	private SingleTonEger() {
	}

	public synchronized SingleTonEger getInstance() {
		if (obj == null) {
			obj = new SingleTonEger();
		}
		return obj;
	}

}
