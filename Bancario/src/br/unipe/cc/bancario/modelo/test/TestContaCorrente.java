package br.unipe.cc.bancario.modelo.test;

import br.unipe.cc.bancario.modelo.Conta;
import br.unipe.cc.bancario.modelo.ContaCorrente;
import junit.framework.TestCase;

public class TestContaCorrente extends TestCase {
	
	private Conta cc;
	private Conta cc2;
	
	public void setUp() {
		System.out.println("setUp().");
		cc = new ContaCorrente();	
		cc.setSaldo(10.00);
		cc2 = new ContaCorrente();
		cc2.setSaldo(20.00);
	}
	
	public void tearDown() {
		System.out.println("tearDown().");
		cc = null;
		cc2 = null;
	}

	
	public void testDebitar() {
		System.out.println("testDebitar().");
		cc.debitar(5.00);
		assertEquals(cc.getSaldo(), 5.00);
	}

	public void testCreditar() {
		System.out.println("testCreditar().");
		cc.creditar(100.00);
		assertEquals(cc.getSaldo(), 110.00);
	}	
	
	public void testTransferir(){
		System.out.println("testTransferir().");
		cc2.transferir(cc, 10.00);//Tirando 10 da conta cc2 e colocando os 10 em cc.
		assertEquals(cc2.getSaldo(), 10.00);//Verificando se cc2 foi atualizada (antes 20 depois 10).
	}
}
