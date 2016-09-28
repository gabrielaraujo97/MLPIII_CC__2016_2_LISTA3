package br.unipe.cc.fita.model.test;

import br.unipe.cc.fita.model.Fita;
import br.unipe.cc.fita.model.FitaInfantil;
import junit.framework.TestCase;

public class TestFitaInfantil extends TestCase {

	Fita fitaInfantil;

	public void setUp() {
		fitaInfantil = new FitaInfantil();
	}

	public void tearDown() {
		fitaInfantil = null;
	}

	public void testCalcularLocacao() {

		double f = fitaInfantil.CalcularLocacao(10.0);

		assertEquals(f, 6.0);
	}

}
