package br.unipe.cc.fita.model.test;

import br.unipe.cc.fita.model.Fita;
import br.unipe.cc.fita.model.FitaLancamento;
import junit.framework.TestCase;

public class TestFitaLancamento extends TestCase {

	Fita fitaLancamento;

	public void setUp() {
		fitaLancamento = new FitaLancamento();
	}

	public void tearDown() {
		fitaLancamento = null;
	}

	public void testCalcularLocacao() {

		double f = fitaLancamento.CalcularLocacao(10.0);

		assertEquals(f, 12.0);
	}
	
	

}
