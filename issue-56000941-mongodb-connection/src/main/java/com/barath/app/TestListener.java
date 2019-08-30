package com.barath.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TestListener implements ApplicationListener<TestEvent> {

    private TestService testService;

    @Autowired
    public TestListener(TestService testService) {
        this.testService = testService;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void onApplicationEvent(TestEvent applicationEvent) {
    	System.out.println("event called");
        testService.save(1L,"One");
    }
}
