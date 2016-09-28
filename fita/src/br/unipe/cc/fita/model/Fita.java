package br.unipe.cc.fita.model;

public class Fita {

	protected double precoDeLocacao;
	private String titulo;
	private String categoria;

	public double CalcularLocacao(double precoDeLocacao){
		return this.precoDeLocacao = precoDeLocacao;
	}
	
	
	public double getPrecoDeLocacao() {
		return precoDeLocacao;
	}

	public void setPrecoDeLocacao(double precoDeLocacao) {
		this.precoDeLocacao = precoDeLocacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
