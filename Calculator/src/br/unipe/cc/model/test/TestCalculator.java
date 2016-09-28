package br.unipe.cc.model.test;

import br.unipe.cc.model.Calculator;
import junit.framework.TestCase;

public class TestCalculator extends TestCase{

	public void testEvaluatesExpression(){
		Calculator calculator = new Calculator();	
		int sum = calculator.evaluate("1+2+3");
		assertNotNull(sum);
		assertEquals(6, sum);
	}
	
}
