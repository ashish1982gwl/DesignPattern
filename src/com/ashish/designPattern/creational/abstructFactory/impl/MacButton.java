package com.ashish.designPattern.creational.abstructFactory.impl;

import com.ashish.designPattern.creational.abstructFactory.inf.Button;

public class MacButton implements Button{

	@Override
	public void printButtonType() {
		System.out.println("We are using Mac machine, since its Mac machine button!!");
		
	}

}
