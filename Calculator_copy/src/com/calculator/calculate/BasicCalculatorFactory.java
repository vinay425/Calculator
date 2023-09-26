package com.calculator.calculate;

public class BasicCalculatorFactory implements CalculatorFactory {

	@Override
	public Calculator createCalculator() {
		
		return new BasicCalculator();
	}

}
