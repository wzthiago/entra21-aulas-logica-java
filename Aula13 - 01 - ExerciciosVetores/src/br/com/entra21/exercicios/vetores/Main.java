package br.com.entra21.exercicios.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;

		do {

			System.out.println(escreverMenu());
			option = input.nextByte();

			// utilizando do-while, pois me permite entrar no bloco antes de testar a
			// condi;�o de permanencia

			switch (option) {

			case 0:
				System.out.println("Obrigado por usar o programa!");
				break;

			case 1:
				exibirTamanhoVetor();
				break;

			case 2:
				exibirTamanhoVetoresInicializados();
				break;

			case 3:
				vetorCom5ParaInicializar();
				break;

			case 4:
				definirTamanhoVetorParaInicializar();
				break;

			case 5:
				percorrerVetorInicializadoCrescenteDecrescente();
				break;

			case 6:
				exibirVetorInteirosNaoInicializado();
				break;

			default:

				break;

			}
			// caso a cond��o de permanencia seja true, repita o bloco
		} while (option != 0); // enquanto n�o for 0 repita

	}

	public static void exibirTamanhoVetor() {

		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanho =" + vetorBytes.length);
		System.out.println("vetorShorts tamanho =" + vetorShorts.length);
		System.out.println("vetorInts tamanho =" + vetorInts.length);
		System.out.println("vetorLongs tamanho =" + vetorLongs.length);
		System.out.println("vetorChars tamanho =" + vetorChars.length);
		System.out.println("vetorFloats tamanho =" + vetorFloats.length);
		System.out.println("vetorDoubles tamanho =" + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho =" + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializados() {

		byte vetorBytes[] = { 5, 7, 9, 10 };
		short vetorShorts[] = { 140, 187, 195 };
		int vetorInts[] = { 1666, 1250 };
		long vetorLongs[] = { 100000, 200000, 300000 };
		float vetorFloats[] = { 10000.50f, 20000.2f, 50000.32f };
		double vetorDoubles[] = { 150000.354d, 400000.12345d };
		char vetorChars[] = { 'a', 'b', 'c', 'd', 'e' };
		boolean vetorBooleans[] = { true, false, false, true };

		System.out.println("vetorBytes tamanho =" + vetorBytes.length);
		System.out.println("vetorShorts tamanho =" + vetorShorts.length);
		System.out.println("vetorInts tamanho =" + vetorInts.length);
		System.out.println("vetorLongs tamanho=" + vetorLongs.length);
		System.out.println("vetorFloats tamanho=" + vetorFloats.length);
		System.out.println("vetorDoubles tamanho=" + vetorDoubles.length);
		System.out.println("vetorChars tamanho=" + vetorChars.length);
		System.out.println("vetorBooleans tamanho=" + vetorBooleans.length);
	}

	private static void vetorCom5ParaInicializar() {

		int vetorInts[] = new int[5];
		Scanner input = new Scanner(System.in);

		for (byte contador = 0; contador < vetorInts.length; contador++) {
			System.out.println("Inicializando a posi��o " + (contador + 1) + " no indice " + contador);
			vetorInts[contador] = input.nextByte();

		}

	}

	private static void definirTamanhoVetorParaInicializar() {

		Scanner input = new Scanner(System.in);
		byte tamanho;
		byte vetorBytes[];

		System.out.println("Informe o tamanho do vetor: ");
		tamanho = input.nextByte();
		vetorBytes = new byte[tamanho];

		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println("Informe o valor para o item " + (count + 1) + " no �ndice [" + count + "]");
			vetorBytes[count] = input.nextByte();

		}

	}

	private static void percorrerVetorInicializadoCrescenteDecrescente() {

		byte vetorBytes[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println("Percorendo do in�cio ao fim :" + vetorBytes[count]);

		}
		System.out.println("-------------------------------------");
		for (byte count = (byte) (vetorBytes.length - 1); count >= 0; count--) {
			// come�ando com o tamanho -1, pq o indice sempre tem um valor a menos
			// condi��o de permanencia, enquanto meu contado for maior que 0, comcei com
			// valor alto e pretendo para ao chegar no zero
			// como uma repeti��o decrescente utilizo o dcremento no contador
			System.out.println("Percorrendo do fim ao in�cio :" + vetorBytes[count]);
		}

	}

	public static void exibirVetorInteirosNaoInicializado() {

		byte vetorBytes[] = new byte[10];
		Scanner entrada = new Scanner(System.in);
		String resposta;
		byte index = 0;

		do {
			System.out.println("Informe um valor para o indice [" + index + "]");
			vetorBytes[index] = entrada.nextByte();

			System.out.println("Gostaria de inicializar outro indice?");
			resposta = entrada.next();

			if (resposta.equalsIgnoreCase("sim")) {
				do {
					System.out.println("Informe um indice v�lido entre 0 e " + (vetorBytes.length - 1));
					index = entrada.nextByte();// Se o usuario digitar um valor valido esse index sera usado no meu DO
												// principal, onde a logica se repete

				} while (index < 0 || index >= vetorBytes.length);// A posicao escolhida nao pode ser menor do que 0 nem
																	// o tamanho do vetor ou superior
				// Exemplo: O range valido � de 0 a 9, qualquer numero alem disso fica preso
				// nesse loop

			}

		} while (resposta.equalsIgnoreCase("sim"));

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println("vetorBytes[" + contador + "] = " + vetorBytes[contador]);

		}

	}

	public static String escreverMenu() {
		String menu = "Escolha uma op��o do menu de Pr�ticas\n";
		menu += "0 - Sair\n";
		menu += "1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "3 - Criar um vetor de 5 posi��es, para que o usu�rio alimente esses valores\n";
		menu += "4 - Criar um vetor com o tamanho informado pelo usu�rio e depois solicitar que o usu�rio informe os respectivos valores\n";
		menu += "5 - Criar um vetor de inteiros inicializado , para percorrer: Do inicio ao fim, Do fim ao inicio, Para exibir os valores\n";
		menu += "6 - Criar um vetor de inteiros n�o inicializado\n";
		menu += "---------------------------------------------";

		return menu;

	}

}
