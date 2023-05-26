package com.ashish.designPattern.Behavioural.command.impl;

import com.ashish.designPattern.Behavioural.command.inf.Command;

public class RemoteControlInvoker {
	private Command command;

	RemoteControlInvoker(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.doOperation();
	}
}
