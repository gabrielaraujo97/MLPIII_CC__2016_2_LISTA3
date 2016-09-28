package br.unipe.cc.fita.model;

public class FitaLancamento extends Fita {

	public double CalcularLocacao(double precoDeLocacao) {
		return this.precoDeLocacao = (precoDeLocacao + (precoDeLocacao * 0.2));
	}

}
