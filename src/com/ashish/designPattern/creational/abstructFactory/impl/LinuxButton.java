package com.ashish.designPattern.creational.abstructFactory.impl;

import com.ashish.designPattern.creational.abstructFactory.inf.Button;

public class LinuxButton implements Button{

	@Override
	public void printButtonType() {
		System.out.println("We are using Linux machine, since its linux machine button!!");
		
	}

}
