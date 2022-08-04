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
	
}
