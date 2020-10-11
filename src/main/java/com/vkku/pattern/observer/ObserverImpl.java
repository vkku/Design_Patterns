package com.vkku.pattern.observer;

public class ObserverImpl implements Observer{

	Subject subject;
	
	@Override
	public void update() {
		System.out.println("Observer Implementation - Generic : "  + getStateAsString());
	}

	private String getStateAsString() {
		return String.valueOf((subject.getState()));
	}
	
	public ObserverImpl(Subject subject) {
		this.subject = subject;
		subject.register(this); 
	}
	
	
	
}
