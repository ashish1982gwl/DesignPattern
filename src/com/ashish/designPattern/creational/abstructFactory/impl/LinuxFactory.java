package com.ashish.designPattern.creational.abstructFactory.impl;

import com.ashish.designPattern.creational.abstructFactory.inf.Button;
import com.ashish.designPattern.creational.abstructFactory.inf.CheckBox;
import com.ashish.designPattern.creational.abstructFactory.inf.GUIFactory;

public class LinuxFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public CheckBox createCheckbox() {
		// TODO Auto-generated method stub
		return new LinuxCheckBox();
	}

}
