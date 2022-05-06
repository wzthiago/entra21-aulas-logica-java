package br.com.entra21.exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		byte mes;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o mês de seu Aniversário");
		mes = sc.nextByte();		
		
		switch (mes) {
		case 1:
			System.out.println(nome + " Nasceu em Janeiro");
			break;
		case 2:
			System.out.println(nome + " Nasceu em Fevereiro");
			break;
		case 3:
			System.out.println(nome + " Nasceu em Março");
			break;
		case 4:
			System.out.println(nome + " Nasceu em Abril");
			break;
		case 5:
			System.out.println(nome + " Nasceu em Maio");
			break;
		case 6:
			System.out.println(nome + " Nasceu em Junho");
			break;
		case 7:
			System.out.println(nome + " Naceu em Julho");
			break;
		case 8:
			System.out.println(nome + " Nasceu em Agosto");
			break;
		case 9:
			System.out.println(nome + " Nasceu em Setembro");
			break;
		case 10:
			System.out.println(nome + " Nasceu em Outubro");
			break;
		case 11:
			System.out.println(nome + " Nasceu em Novembro");
			break;
		case 12:
			System.out.println(nome + " Nasceu em Dezembro");
			break;
			
		default:
			System.out.println("Mês digitado é inválido!");
			break;
		}

	}

}
