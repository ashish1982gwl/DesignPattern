package com.ashish.designPattern.Behavioural.command.impl;

import com.ashish.designPattern.Behavioural.command.inf.Command;

public class TubeLightOff implements Command {
	private TubeLightExecutor TubeLightExecutor;

	public TubeLightOff(TubeLightExecutor TubeLightExecutor) {
		this.TubeLightExecutor = TubeLightExecutor;
	}

	@Override
	public void doOperation() {
		TubeLightExecutor.switchOff();

	}

}
