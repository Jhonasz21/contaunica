package contaunica;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	static int qtdcontas = 0;

	public Conta(String pTitular) {
		this.titular = pTitular;
		qtdcontas++;
		this.numero = qtdcontas;
		this.saldo = 0;
	}

	public void DadosBancarios() {
		System.out.println("");
		System.out.println("-- Dados Banc�rios --");
		System.out.println("- N�meros: " + this.numero);
		System.out.println("- Titular: " + this.titular);
		System.out.println("- Saldo: " + this.saldo);
		System.out.println("--- Fim Dados Banc�rios ---");
		System.out.println("");
	}
	
	public void Depositar(double pValor) {
		System.out.println("");
		System.out.println("--- Realizando dep�sito ---");
		System.out.println("- Saldo anterior: "+ this.saldo);
		
		this.saldo += pValor;
		
		System.out.println("- Saldo posterior: " + this.saldo);
		System.out.println("--- Fim do dep�sito ---");
		System.out.println("");
	}
}
