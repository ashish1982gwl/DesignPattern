package com.ashish.designPattern.Behavioural.command.impl;

import com.ashish.designPattern.Behavioural.command.inf.Command;

public class TubeLightOn implements Command{
	private TubeLightExecutor TubeLightExecutor;

	public TubeLightOn(TubeLightExecutor TubeLightExecutor) {
		this.TubeLightExecutor = TubeLightExecutor;
	}

	@Override
	public void doOperation() {
		TubeLightExecutor.switchOn();
		
	}

}
