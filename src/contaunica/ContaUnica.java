package contaunica;

import java.util.Scanner;

public class ContaUnica {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String aux;
		int opcao;
		double valor;
		
		System.out.println("Digite o titular da conta: ");
		aux = in.nextLine();
		
		Conta c1 = new Conta(aux);
		
		do {
			System.out.println("");
			System.out.println("--- MENU ---");
			System.out.println("(1) Dados banc�rios");
			System.out.println("(2) Dep�sito");
			System.out.println("(3) Saque");
			System.out.println("(0) Sair");
		
			System.out.println("Op��o: ");
			opcao = in.nextInt();
			
			if(opcao == 1) {
				c1.DadosBancarios();
			}
			else if(opcao == 2) {
				System.out.println("Digite o valor do dep�sito: ");
				valor = in.nextDouble();
				
				c1.Depositar(valor);
			}
			else if (opcao == 3) {
				System.out.println("Digite o valor do saque: ");
				valor = in.nextDouble();
				
				c1.Sacar(valor);
				}	
			else if(opcao != 0) {
				System.out.println("Op��o inv�lida");
			}
			
			System.out.println("");
			
		} while(opcao != 0);
		
	}
  }
