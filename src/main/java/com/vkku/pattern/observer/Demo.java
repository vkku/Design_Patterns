package com.vkku.pattern.observer;

public class Demo extends Subject {

	
	public static void main(String[] args) {
		
		Subject demoSubject = new Subject();
		Observer genericObserver = new ObserverImpl(demoSubject);

		demoSubject.setState(10);
		demoSubject.setState(15);
		
	}
	
}
