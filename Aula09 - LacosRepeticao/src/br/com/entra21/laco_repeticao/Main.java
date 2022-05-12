package br.com.entra21.laco_repeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		menuFor();
	}

	private static void menuFor() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha uma opção para aprender for");
		System.out.println("1 - for simpls:");
		System.out.println("2 - for dentro de for:");
		System.out.println("3 - Exercício quantidade Inicial:");
		System.out.println("4 - Exercício quantidade Final:");
		System.out.println("5 - Retornar a tabuada escolhida:");
		System.out.println("6 - Retornar a tabuada de 1 até a escolhoda pelo usuário:");
		String opcao = scanner.next();

		switch (opcao.toLowerCase()) {

		case "1": // estrutura simples
			aulaForSimples(); // função do tipo procedimento sem retorno
			break;
		case "2": // estrutura complexa
			forDentroFor(); // função do tipo procedimento sem retorno
			break;
		case "3": // exercício de contagem crescente
			contagemCrescente(); // função do tipo procedimento sem retorno
			break;
		case "4": // exercício de contagem decrescente
			contagemDecrescente(); // função do tipo procedimento sem retorno
			break;
		case "5": // exercício tabuada do número informado
			completaTabuada(); // função do tipo procedimento sem retorno
			break;
		case "6": // exercício tabuada completa
			tabuadaCompleta(); // função do tipo procedimento sem retorno
			break;

		}
	}

	// --------APRENDENDO ESTRUTURA FOR SIMPLES-------------//
	public static void aulaForSimples() {
		System.out.println("Aprendendo sobre for");

		// contador 01
		for (int x = 1; x <= 10; x = x + 1) {
			System.out.println("Repetindo: " + x);
			System.out.println("-------------------");
		}
		System.out.println("\n");

		// contador 02
		for (int x = 1; x <= 10; x += 2) {
			System.out.println("Repetindo: " + x);
		}
		System.out.println("\n");

		// contador 03
		for (int x = 4; x <= 10; x += 2) {
			System.out.println("Repetindo: " + x);
		}
		for (int x = 10; x > 0; x -= 1) {
			System.out.println("Resultado " + x);
		}
		System.out.println("\n");

		// contador 04
		int tabuada = 3;
		int contador;

		for (contador = 1; contador <= 10; contador++) {

			System.out.println("Tabuada" + contador + "x" + tabuada + "=" + contador * tabuada);

		}

		System.out.println("Olha como o contador ficou: " + contador);
	}

	// --------APRENDENDO ESTRUTURA FOR DENTRO DE FOR--------//
	public static void forDentroFor() {
		System.out.println("Aprendendo sobre for de maneira mais complexa");

		byte nivelMaior = 3, nivelDetalhe = 3;

		for (int contador = 1; contador <= nivelDetalhe; contador++) {
			System.out.println("Para o nível maior repetindo pela " + contador + "º vez \n");

			for (int contadorInterno = 1; contadorInterno <= nivelDetalhe; contadorInterno++) {
				System.out.println("Para o nivel menor repetindo pela " + contadorInterno + "º vez");

			}
		}

	}

	// -----------FOR CONTAGEM CRESCENTE----------//
	public static void contagemCrescente() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Vamos contar até qual número: ");
		byte opcao = scanner.nextByte();

		for (int contador = 1; contador <= opcao; contador++) {
			System.out.println("Contando..." + contador);
		}
	}

	// -----------FOR CONTAGEM REGRESSIVA----------//
	public static void contagemDecrescente() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha um número para decrementar: ");
		int opcao = scanner.nextInt();

		int contador;
		for (contador = opcao; contador > 0; contador--) {
			System.out.println("Decrementando..." + contador);
		}
		System.out.println("" + contador);

	}

	// ----------EXERCICIO TABUADA----------------//
	private static void completaTabuada() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número para resolver a tabuada dele: ");
		int opcao = scanner.nextInt();

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(contador + "x" + opcao + "=" + (contador * opcao));
		}

	}

	private static void tabuadaCompleta() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número para resolver a tabuada de 1 até o número escolhido:");
		int opcao = scanner.nextInt();
		
		for(int contador = 1; contador <= opcao; contador++ ) { // for para montar a tabuada
			System.out.println("\n"+"TABUADA: " + contador);
			
			for(int contInterno = 1; contInterno <= 10; contInterno++ ) { // for para calcular a tabuada
				System.out.println(contador + "x" + contInterno + "=" + (contador*contInterno));
			}
		}
		
	}
}
