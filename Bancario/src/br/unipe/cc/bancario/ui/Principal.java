package br.unipe.cc.bancario.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.unipe.cc.bancario.modelo.ContaCorrente;

public class Principal {

	public static void main(String[] args) {
		
		
		List<String> xxx = new ArrayList();
		
		xxx.add("Matheus");
		xxx.add("Bruno");
		xxx.add("Gabriel");
		
		Collections.sort(xxx);
		
		System.out.println(xxx);
		
		
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setSaldo(100.00);
		cc1.creditar(50.00);
		cc1.debitar(25.00);
		
		System.out.println(cc1.getSaldo());
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.setSaldo(20.00);
		
		cc1.transferir(cc2, 20.00);
		
		System.out.println(cc2.getSaldo());
	}
}
