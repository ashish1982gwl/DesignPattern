package com.ashish.designPattern.creational.factory.impl;

import com.ashish.designPattern.creational.factory.inf.Aeps;

public class FactoryDemo {
public static void main(String a[]) {
	Aeps obj=new FactoryImpl().getAepsObj("yes");
	obj.doAepsOperation();
}
}
