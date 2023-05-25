package com.ashish.designPattern.Behavioural.memento;

public class MementoDemo {
	public static void main(String a[]) {
		CareTaker careTaker=new CareTaker();
		Orignator objOrignator=new Orignator();
		careTaker.saveState(objOrignator.saveStateMemento("1 obj"));
		careTaker.saveState(objOrignator.saveStateMemento("2 obj"));
		careTaker.saveState(objOrignator.saveStateMemento("3 obj"));
		careTaker.saveState(objOrignator.saveStateMemento("4 obj"));
     
		System.out.println("Current State ::"+objOrignator.getCurrentState());
		System.out.println("Previos State ::"+objOrignator.
				getStateFromMemento(careTaker.getState(3)));

	}

}
