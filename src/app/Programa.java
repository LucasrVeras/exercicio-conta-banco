package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o numero da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Informe o nome do titular: ");	
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Deseja colocar algum valor na conta: ");
		char resposta = sc.next().charAt(0);
		
		Conta conta = new Conta(numeroConta, nome);
		
		if (resposta == 's') {
			
			System.out.print("Entre com o valor inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nome, depositoInicial);
			
		} else {
			
			conta = new Conta(numeroConta, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(conta);
		
		
		sc.close();
		
	}
}
