package br.com.entra21.aula14.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	// definindo uma variavel entrada do tipo Scanner acessivel em toda a classe
	// Main
	// como o m�todo main � static, tanto metodos ou vari�veis devem ser static para
	// se relacionarem com o metodo main

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte opcao;

		do {
			System.out.println(escreverMenuMatrizes());
			opcao = entrada.nextByte();
			switch (opcao) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderMatrizesSimples();
				break;

			case 2:
				aprenderMatrizesInicializadas();
				break;

			default:
				System.out.println("Para!!! O menu ta simples, s� 1 ou 2");
				break;

			}

		} while (opcao != 0);
		System.out.println("Fim da aula sobre matrizes");
	}

	private static String escreverMenuMatrizes() {
		String conteudoMenu = "Escolha uma op��o para aprender: \n";
		conteudoMenu += "\t1 -Inicializando matrizes com tamanho definidos\n";
		conteudoMenu += "\t2 - Inicializando matrizes com valores predeterminadosn";

		return conteudoMenu;
	}

	private static void aprenderMatrizesSimples() {
		System.out.println("Aprendendo matrizes simples");

		System.out.println("Armazenar as 3 notas de todos os 10 alunos");
		float notas[][];
		notas = new float[10][5];
		// primeiro indice � a quantidade de vetores
		// segundo indice � a capacidade de cada vetor
		// apenas no ultimo indice da cria��o pela sintaxe ficam os valores

		byte quantidadeAlunos, quantidadeNotas;
		System.out.println("Informe a quantidade de alunos");
		quantidadeAlunos = entrada.nextByte();

		System.out.println("Informe a quantidade de notas para cada aluno");
		quantidadeNotas = entrada.nextByte();

		// qem decide o tamanho da minha matriz � o usu�rio
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for (byte aluno = 0; aluno < novasNotas.length; aluno++) {
			System.out.println("Nessa posi��o [" + aluno + "] temos " + novasNotas[aluno].length + " notas");

			for (byte nota = 0; nota < novasNotas[aluno].length; nota++) {
				System.out.println("\t valor da nota [" + nota + "] ===> " + novasNotas[aluno][nota]);

			}

		}
		
		System.out.println("Confiando que tenho no minimo 2 alunos");
		System.out.println("Olha as notas do segundo aluno");
		System.out.println(novasNotas[1][0]);
		System.out.println(novasNotas[1][1]);
		System.out.println(novasNotas[1][2]);

	}

	private static void aprenderMatrizesInicializadas() {
		System.out.println("Aprendendo sobre matrizes inicializadas e irregulares ");
		
		float salarioAlunos[][]= {
				{1000 , 1250.50f , 255.35f},
				{2600 , 3500 , 4500},
				{50000 , 150000 , 200000},
				{677000 , 150000 , 23400},
		};
		
		
		byte matrizIrregular [][]= {
				{1,2,3,4,5,6,7},
				{4,3,2,1},
				{10,12},
				{-127,0,127},
		};
		
		String ementa[][] = { { "Metodologias �geis", "introdu��o", "metodologias", "git" },
				{ "l�gica com java", "variaveis", "constantes", "coment�rios", "desvios condicionais",
				"la�os de repeti��o" },
				{ "POO", "Classes", "Objetos", "Heran�a", "Polimorfismo", "Encapsulamento", "conceitos" },

				 };

	}

}
