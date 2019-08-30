package com.barath.app;

import org.springframework.context.ApplicationEvent;

public class TestEvent  extends ApplicationEvent{

	
	private static final long serialVersionUID = 5405161822284975490L;

	public TestEvent(Object source) {
		super(source);
		
	}

}
