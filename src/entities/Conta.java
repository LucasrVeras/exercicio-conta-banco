package entities;

public class Conta {

	private int numeroConta;
	private String nome;
	private double saldo;
	
	//Construtores
	
	public Conta(int conta, String nome) {
		this.numeroConta = conta;
		this.nome = nome;
	}
	
	public Conta(int conta, String nome, double saldo) {
		this.numeroConta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	//Métados
	public void deposito(double total) { //Deposito
		saldo += total;
	}
	
	public void saque(double total) { //saque
		saldo -= total + 5.0;
	}
	
	//Getters and Setters 
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDeposito() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Conta Numero: " + numeroConta + ", Nome do Titular: " + nome + ", Saldo em Conta: " + saldo;
	}
	
	
}
