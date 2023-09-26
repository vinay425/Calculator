package com.calculator.calculate;

import javax.swing.JOptionPane;

public class CalculatorUI {
	public static void main(String[] args) {
		while (true) {
			String userInput = JOptionPane.showInputDialog("Enter 1 to do calculation\nEnter 0 to exit:");

			if (userInput == null) {
				// User closed the dialog or clicked Cancel
				JOptionPane.showMessageDialog(null, "Calculator is closed...");
				break; // Exit the loop
			}

			try {
				int val = Integer.parseInt(userInput);

				if (val == 1) {

					String type = JOptionPane.showInputDialog(
							"Choose a calculator:\nEnter 0 for Basic Calculator\nEnter 1 for Scientific calculator");

					int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num1:"));
					int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num2:"));
					String operation = JOptionPane.showInputDialog("Enter the operation:");

					double result = PerformCalculation.typeOfCalculator(Integer.parseInt(type), num1, num2, operation);
					JOptionPane.showMessageDialog(null, "Result: " + result);

				} else if (val == 0) {
					JOptionPane.showMessageDialog(null, "Calculator is closed...");
					break; // Exit the loop
				} else {
					JOptionPane.showMessageDialog(null, "Invalid input. Enter 0 to exit or 1 for calculation.");
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid input. Enter 0 to exit or 1 for calculation.");
			}
		}
	}
}
