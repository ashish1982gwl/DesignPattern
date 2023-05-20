package com.ashish.designPattern.creational.abstructFactory.impl;

import com.ashish.designPattern.creational.abstructFactory.inf.GUIFactory;

public class Demo {
	// TODO Auto-generated constructor stub
	public static void main(String a[]) {
		String osName = System.getProperty("os.name").toLowerCase();
		GUIFactory GUIFactory = null;
		if (osName.contains("linux")) {
			GUIFactory = new LinuxFactory();
		} else {
			GUIFactory = new MacFactory();
		}
		Application Application = new Application(GUIFactory);
		Application.print();
	}

}
