package entities;

public class Menus {

	public static void TipoConta() {
		System.out.println("### Tipo de Conta ###");
		System.out.println("1 - Poupança");
		System.out.println("2 - Conta Corrente");
		System.out.print("Tipo de Conta: ");
	}
	public static void Opcao() {
		System.out.println("\n*** Operações na conta ***");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Transferir");
		System.out.println("4 - Imprimir Extrato das duas contas:");
		System.out.println("5 - Imprimir Extrato Poupança");
		System.out.println("6 - Imprimir Extrato Conta Corrente");
		System.out.print("Opção: ");
	}

}
