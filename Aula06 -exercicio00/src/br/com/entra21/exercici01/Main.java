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
			System.out.println("E a� baixinho, " + nome + " vaza, voc� s� tem " + altura + " a altura min�ma � :" + ALTURA_MINIMA);
			
		}else {
			System.out.println("Sua entrada est� liberada :" + nome);
		}

	}

}
