package com.intellimed.spring_demo;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "Draw Event Occured!";
	}

}
