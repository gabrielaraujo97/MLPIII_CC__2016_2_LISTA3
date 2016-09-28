package br.unipe.cc.bancario.modelo;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

	public void debitar(double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
		}
	}

	public void creditar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public void transferir(Conta destino, double valor) {
		if (this.saldo > valor) {
			this.debitar(valor);
			destino.creditar(valor);
		}
	}

	public List<Object> buscaTodasContas() {
		List<Object> contas = new ArrayList<>();

		return contas;
	}
}