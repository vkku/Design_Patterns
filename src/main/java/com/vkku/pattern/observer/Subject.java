package com.vkku.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	public List<Observer> observerList = new ArrayList<>();
	private int state;
	
	public void register(Observer observer) {
		observerList.add(observer);
	}
	
	public void updateAll() {
		for(Observer observer : observerList) {
			observer.update();
		}
	}
	
	public void setState(int state) {
		this.state = state;
		updateAll();
	}

	public int getState() {
		return state;
	}
	
	

}
