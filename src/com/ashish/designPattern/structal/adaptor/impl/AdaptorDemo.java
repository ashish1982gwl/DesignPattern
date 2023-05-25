package com.ashish.designPattern.structal.adaptor.impl;

public class AdaptorDemo {
	public static void main(String a[]) {
		XmlDataParser dataParser = new XmlDataParser();
		Adaptor Adaptor = new Adaptor(dataParser);
		Adaptor.doOperationOnJsonData();
	}
}
