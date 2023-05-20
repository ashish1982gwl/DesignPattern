package com.ashish.designPattern.creational.abstructFactory.impl;

import com.ashish.designPattern.creational.abstructFactory.inf.Button;
import com.ashish.designPattern.creational.abstructFactory.inf.CheckBox;
import com.ashish.designPattern.creational.abstructFactory.inf.GUIFactory;

public class Application {
	Button objButton;
	CheckBox objBox;

	public Application(GUIFactory GUIFactory) {
		this.objBox = GUIFactory.createCheckbox();
		this.objButton = GUIFactory.createButton();
	}

	public void print() {
		objButton.printButtonType();
		objBox.printCheckBoxType();
	}

}
