package com.ashish.designPattern.creational.abstructFactory.impl;

import com.ashish.designPattern.creational.abstructFactory.inf.GUIFactory;
/*
 * Here is below example two factory provide us final product 
 * The Abstract Factory pattern is pretty common in Java code. 
 * Many frameworks and libraries use it .
 * Java Library
 * javax.xml.parsers.DocumentBuilderFactory#newInstance()
 * javax.xml.transform.TransformerFactory#newInstance()
 */

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
