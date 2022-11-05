package application;

import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.Menus;


public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sair;
		double valor;
		int tipoConta;
		int opcaoOperacao;
		Cliente c1 = new Cliente("João Furtado", 19, "158459654-64");
		

		Conta cc = new ContaCorrente(c1);
		
		Conta poupanca = new ContaPoupanca(c1);
		do {
			Menus.TipoConta();
			tipoConta = sc.nextInt();
			Menus.Opcao();
			opcaoOperacao = sc.nextInt();
			sc.nextLine();
			switch(opcaoOperacao) {
				case 1:
					System.out.print("\nValor para depositar: ");
					valor = sc.nextDouble();
					if(tipoConta == 1) {
						poupanca.depositar(valor);
					}else if(tipoConta == 2) {
						cc.depositar(valor);
					}else {
						System.out.println("\nTipo de conta invalida!");
					}
					break;
				case 2:
					System.out.print("\nValor para sacar: ");
					valor = sc.nextDouble();
					if(tipoConta == 1) {
						poupanca.sacar(valor);
					}else if(tipoConta == 2) {
						cc.sacar(valor);
					}else {
						System.out.println("\nTipo de conta invalida!");
					}
					break;
				case 3:
					System.out.print("\nValor para transferir para " + (tipoConta == 1? "Conta Corrente:" : "Poupança:"));
					valor = sc.nextDouble();
					if(tipoConta == 1) {
						poupanca.tranferir(valor, cc);
					}else if(tipoConta == 2) {
						cc.tranferir(valor, poupanca);
					}else {
						System.out.println("\nTipo de conta invalida!\n");
					}
					break;
				case 4:
					poupanca.imprimirExtrato();
					cc.imprimirExtrato();
					break;
				case 5:
					poupanca.imprimirExtrato();
					break;
				case 6:
					cc.imprimirExtrato();
					break;
				default:
					System.out.println("\nOpção inválida!");
					break;
			}
			System.out.print("\nDesejar Sair(1 sim / 0 não): ");
			sair = sc.nextInt();
			System.out.println("\n");
		}while(sair == 0);
			
		sc.close();
	}
	
}
