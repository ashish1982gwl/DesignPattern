package com.ashish.designPattern.creational.abstructFactory.impl;

import com.ashish.designPattern.creational.abstructFactory.inf.CheckBox;

public class MacCheckBox implements CheckBox{

	@Override
	public void printCheckBoxType() {
		System.out.println("We are using mac machine, since its Mac check box!!");
		
	}

}
