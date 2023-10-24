package br.com.calculadora1.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculadora {

	public int SomaInteiros(int a, int b) {
		return a + b;
	}

	public int subtraiInteiros(int a, int b) {
		return a - b;
	}

	public int multiplicaInteiros(int a, int b) {
		return a * b;
	}

	public int divideInteiros(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		SpringApplication.run(Calculadora.class, args);
	}

}
