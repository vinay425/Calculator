package com.calculator.calculate;

public class ScientificCalculator implements Calculator {
	@Override
	public double add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public double sub(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public double mul(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public double div(int num1, int num2) {
		return num1/num2;
	}

}
