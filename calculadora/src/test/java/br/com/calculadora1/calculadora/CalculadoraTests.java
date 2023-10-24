package br.com.calculadora1.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraTests {

	@Test
	void contextLoads() {
	}

	@Test
	void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.SomaInteiros(2, 2));
	}
	
	@Test
	void tresSomaSeteEsperaDez() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(3, 7)==10);
		
	}

	@Test
	void dezSubtraiDoisEsperaOito() {
		Calculadora c = new Calculadora();
		assertEquals(8, c.subtraiInteiros(10,2));
	}

	@Test
	void dezesseteSubtraiDozeEsperaCinco() {
		Calculadora c = new Calculadora();
		assertTrue(c.subtraiInteiros(17, 12)==5);
	}

	@Test
	void doisMultiplicaSessentaEQuatroEsperaCentoEVinteOito() {
		Calculadora c = new Calculadora();
		assertEquals(128, c.multiplicaInteiros(2,64));
	}

	@Test
	void tresMultiplicaQuatroEsperaDoze() {
		Calculadora c = new Calculadora();
		assertTrue(c.multiplicaInteiros(3, 4)==12);
	}

	@Test
	void trintaETresDivideOnzeEsperaTres() {
		Calculadora c = new Calculadora();
		assertEquals(3, c.divideInteiros(33,11));
	}

	@Test
	void quarentaEDoisDivideTresEsperaQuatorze() {
		Calculadora c = new Calculadora();
		assertTrue(c.divideInteiros(42, 3)==14);
	}

}
