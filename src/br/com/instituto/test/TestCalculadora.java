package br.com.instituto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.instituto.lib.Calculadora;

public class TestCalculadora {
			@Test
			public void somaNumerosInteiros(){
				Calculadora calculadora  = new Calculadora();
				assertEquals(calculadora.Soma(2,3), 5, 0);
					
		}
			@Test
			public void somaNumerosInteirosComVirgula(){
				Calculadora calculadora  = new Calculadora();
				assertEquals(calculadora.Soma(2.33, 6.59), 8.92, 0);
					
		}
}
