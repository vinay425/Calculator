package com.calculator.calculate;

public class ScientificCalculatorFactory implements CalculatorFactory {

	@Override
	public Calculator createCalculator() {
		return new ScientificCalculator();
	}

}
