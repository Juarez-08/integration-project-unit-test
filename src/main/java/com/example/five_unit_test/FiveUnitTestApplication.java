package com.example.five_unit_test;

public class FiveUnitTestApplication {

	// Método para sumar dos números
	public static int suma(int a, int b) {
		return a + b;
	}

	// Método para dividir dos números con manejo de división por cero
	public static int division(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("No se puede dividir por cero");
		}
		return a / b;
	}
}
