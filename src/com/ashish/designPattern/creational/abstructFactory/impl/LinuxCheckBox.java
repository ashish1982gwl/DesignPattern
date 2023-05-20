package com.ashish.designPattern.creational.abstructFactory.impl;

import com.ashish.designPattern.creational.abstructFactory.inf.CheckBox;

public class LinuxCheckBox implements CheckBox{

	@Override
	public void printCheckBoxType() {
		System.out.println("We are using Linux machine, since its Linux check box!!");
		
	}

}
