package com.ashish.designPattern.Behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> obj = new ArrayList<Memento>();

	public void saveState(Memento Memento) {
		obj.add(Memento);
	}

	public Memento getState(int count) {
		return obj.get(count);
	}

}
