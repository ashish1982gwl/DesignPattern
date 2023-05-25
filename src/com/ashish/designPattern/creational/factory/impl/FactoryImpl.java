package com.ashish.designPattern.creational.factory.impl;

import com.ashish.designPattern.creational.factory.inf.Aeps;

public class FactoryImpl {
	private String name;

	public Aeps getAepsObj(String bankName) {
		if (bankName != null && bankName.equalsIgnoreCase("icici")) {
			return new IciciAeps();
		}
		if (bankName != null && bankName.equalsIgnoreCase("yes")) {
			return new YesBankAeps();
		}
		if (bankName != null && bankName.equalsIgnoreCase("RBL")) {
			return new RblBankAeps();
		}
		return null;
	}
}
