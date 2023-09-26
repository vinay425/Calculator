package com.calculator.calculate;

public class PerformCalculation {
	@SuppressWarnings("null")
	public static double typeOfCalculator(int type, int num1, int num2, String operation) {

		Calculator cal;
		switch (type) {
		case 0: {
			CalculatorFactory basicCalfactory = new BasicCalculatorFactory();
			cal = basicCalfactory.createCalculator();
			break;
		}

		case 1: {
			CalculatorFactory scientificCalfactory = new ScientificCalculatorFactory();
			cal = scientificCalfactory.createCalculator();
			break;
		}
		default:
			cal = null;
			break;

		}

		switch (operation) {
		case "+":
			return cal.add(num1, num2);
		case "-":
			return cal.sub(num1, num2);
		case "*":
			return cal.mul(num1, num2);
		case "/":
			return cal.div(num1, num2);
		default:
			return 0.0;
		}

	}

}
