package br.com.entra21.exercici01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final double ALTURA_MINIMA = 1.6f  ;
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Digete o nome :");
		String nome = sc.nextLine();
		
		System.out.println("Digite a altura :");
		float altura = sc.nextFloat();
		
		if(altura < ALTURA_MINIMA) {
			System.out.println("E aí baixinho, " + nome + " vaza, vocë só tem " + altura + " a altura miníma é :" + ALTURA_MINIMA);
			
		}else {
			System.out.println("Sua entrada está liberada :" + nome);
		}

	}

}
