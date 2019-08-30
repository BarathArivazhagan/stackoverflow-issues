package com.demo.app;

import org.springframework.stereotype.Component;

@Component("arithmeticCalculator")
@LoggingRequired
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    public double add(double a, double b) {
    	System.out.println("added ");
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

}