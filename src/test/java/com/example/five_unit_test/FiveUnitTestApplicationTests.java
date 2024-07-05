package com.example.five_unit_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FiveUnitTestApplicationTests {

	// Prueba unitaria para el método suma
	@Test
	public void testSuma() {
		int resultado = FiveUnitTestApplication.suma(2, 3);
		assertEquals(5, resultado); // Verifica que la suma sea correcta
	}

	// Prueba unitaria para el método división, esperando una excepción de división por cero
	@Test
	public void testDivisionPorCero() {
		assertThrows(ArithmeticException.class, () -> {
			FiveUnitTestApplication.division(10, 0);
		});
	}

	// Prueba unitaria usando Mockito para simular el comportamiento de un método
	@Test
	public void testMetodoConMockito() {
		// Crear un mock de la interfaz
		MiInterfaz mock = mock(MiInterfaz.class);

		// Definir el comportamiento esperado del mock
		when(mock.metodo()).thenReturn("resultado esperado");

		// Verificar que el método del mock devuelve el resultado esperado
		assertEquals("resultado esperado", mock.metodo());
	}

	// Prueba unitaria con Mockito para verificar la llamada a un método
	@Test
	public void testMetodoConMockitoVerificarLlamada() {
		// Crear un mock de la interfaz
		MiInterfaz mock = mock(MiInterfaz.class);

		// Llamar al método del mock
		mock.metodo();

		// Verificar que el método fue llamado exactamente una vez
		verify(mock, times(1)).metodo();
	}

	// Prueba unitaria con Mockito para verificar los argumentos pasados a un método
	@Test
	public void testMetodoConMockitoVerificarArgumentos() {
		// Crear un mock de la interfaz
		MiInterfaz mock = mock(MiInterfaz.class);

		// Llamar al método del mock con argumentos específicos
		mock.metodoConArgumentos("argumento1", "argumento2");

		// Verificar que el método fue llamado con los argumentos esperados
		verify(mock).metodoConArgumentos(eq("argumento1"), eq("argumento2"));
	}
}
