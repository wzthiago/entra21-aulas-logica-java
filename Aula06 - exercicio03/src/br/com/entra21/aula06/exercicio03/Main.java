package br.com.entra21.aula06.exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(
				"Escreva um menu de op��es e trate a situa��o onde o usu�rio n�o escolha uma op��o informada na lista ");
 
		String opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma op��o:");
		System.out.println("Brasil\nEUA\nChina");
		opcao = entrada.nextLine();

		opcao = opcao.toLowerCase();

		switch (opcao) {
		case "brasil":
			System.out.println("BRASILLL ZIL");
			break;

		case "eua":
			System.out.println("Pra gringo � mais caro");
			break;

		case "china":
			System.out.println("made in china");
			break;

		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		
		
	}

}
