package br.com.instituto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.instituto.lib.Calculadora;

public class TesteCalculadora {
	private Calculadora calculadora;

	@Before
	public void before() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void somaNumerosInteiros() {
		calculadora.Somar(3);
		assertEquals(calculadora.getResultado(), 3, 0);
		calculadora.Somar(7);
		assertEquals(calculadora.getResultado(), 10, 0);
	}

	@Test
	public void somaNumerosComVirgula() {
		calculadora.Somar(2.33);
		assertEquals(calculadora.getResultado(), 2.33, 0); 
	}
	
	@Test
	public void criaCalculadoraComValorInicial() {
		calculadora = new Calculadora(10);
		assertEquals(calculadora.getResultado(), 10, 0);
		calculadora.Somar(3);
		assertEquals(calculadora.getResultado(), 13, 0); 
	}	
	
	@Test
	public void criaCalculadoraSubtrai() {
		calculadora = new Calculadora(10);
		calculadora.Subtrair(8);
		assertEquals(calculadora.getResultado(), 2, 0); 
	
	}
	
	@Test
	public void criaCalculadoraDivide() {
		calculadora = new Calculadora(8);
		calculadora.Divide(8);
		assertEquals(calculadora.getResultado(), 1., 0); 
	
	}
	@Test
	public void criaCalculadoraMultiplica() {
		calculadora = new Calculadora(10);
		calculadora.Multiplica(8);
		assertEquals(calculadora.getResultado(), 80, 0); 
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}