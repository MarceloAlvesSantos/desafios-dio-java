package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta implements IConta{
	
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected Banco banco;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		if(this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			 System.out.println("Saldo insuficiente, limite disponível: R$" + this.saldo);
		}
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		if(valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Valor inválido!");
		}
	}

	@Override
	public void tranferir(double valor, IConta contaDestino) {
		// TODO Auto-generated method stub
		if(valor > 0) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Valor inválido!");
		}
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	protected void imprimirInfosComuns() {
		Date moment = new Date();
		System.out.println(String.format("\nTitular: %s  Idade: %d", this.cliente.getNome(),  this.cliente.getIdade()));
		System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f\n", this.saldo));
		System.out.println("Extrato realizado: " + sdf.format(moment) + "\n");
	}

	

}
