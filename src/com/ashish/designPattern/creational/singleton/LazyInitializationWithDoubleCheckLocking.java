package com.ashish.designPattern.creational.singleton;

public class LazyInitializationWithDoubleCheckLocking {
	private LazyInitializationWithDoubleCheckLocking obj = null;

	private LazyInitializationWithDoubleCheckLocking() {
	}

	public LazyInitializationWithDoubleCheckLocking getInstance() {
		if (obj == null) {
			synchronized (obj) {
				if (obj == null) {
					obj = new LazyInitializationWithDoubleCheckLocking();
				}
			}
			
		}
		return obj;
	}
}
