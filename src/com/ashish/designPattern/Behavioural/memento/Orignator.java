package com.ashish.designPattern.Behavioural.memento;

public class Orignator {
private String state;
	
    public String getCurrentState() {
		return state;
	}
	public Memento saveStateMemento(String state){
		 this.state=state;
		 Memento obj=new Memento();
		 obj.setState(state);
		 return obj;
	}
	public String getStateFromMemento(Memento ObjMemento) {
		return ObjMemento.getState();
	}
}
