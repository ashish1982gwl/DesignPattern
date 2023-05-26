package com.ashish.designPattern.Behavioural.command.impl;

import com.ashish.designPattern.Behavioural.command.inf.Command;

public class CommandDemo {
	public static void main(String a[]) {
		TubeLightExecutor objExecutor = new TubeLightExecutor();
		Command Command1 = new TubeLightOff(objExecutor);
		Command Command2 = new TubeLightOn(objExecutor);
		RemoteControlInvoker RemoteControlInvoker1 = new RemoteControlInvoker(Command1);
		RemoteControlInvoker1.pressButton();
		RemoteControlInvoker RemoteControlInvoker2 = new RemoteControlInvoker(Command2);
		RemoteControlInvoker2.pressButton();
	}
}
