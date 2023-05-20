package com.ashish.designPattern.creational.abstructFactory.impl;

import com.ashish.designPattern.creational.abstructFactory.inf.Button;
import com.ashish.designPattern.creational.abstructFactory.inf.CheckBox;
import com.ashish.designPattern.creational.abstructFactory.inf.GUIFactory;

public class MacFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public CheckBox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacCheckBox();
	}

}
