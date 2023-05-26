package com.ashish.designPattern.Behavioural.stratgy.impl;

import com.ashish.designPattern.Behavioural.stratgy.inf.GiveDiscount;

public class PublicFlatDiscount implements GiveDiscount{
	private int flatAmount;
	public PublicFlatDiscount(int flatAmount) {
		this.flatAmount=flatAmount;
	}

	@Override
	public long giveDiscount(int flatAmount) {
		amount=amount-flatAmount;
		return amount;
	}



}
