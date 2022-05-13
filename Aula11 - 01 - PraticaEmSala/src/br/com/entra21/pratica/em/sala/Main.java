package br.com.entra21.pratica.em.sala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		byte opcao;

		do {
			System.out.println("\nEscolha uma das opções: ");
			System.out.println("0 - \"Sair ");
			System.out.println("1 - Calculando a soma: ");
			System.out.println("2 - Repetir 20 vezes: ");
			System.out.println("3 - Entre vinte pessoas exibir a soma das idades");
			System.out.println("4 - Entre vinte pessoas quantas são de maior idade");
			System.out.println("5 - Entre vinte pessoas quantas são de maior idade");
			System.out.println("6 -");
			System.out.println("9 - Solicite a quantidade de notas e calcule a média do aluno");
			opcao = scanner.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				calculandoSoma();
				break;

			case 2:
				runRepeat20();
				break;

			case 3:
				somaDasIdades();
				break;

			case 4:
				maioresDeIdade();
				break;

			case 5:
				exibirMaisNovo();
				;
				break;

			case 9:
				mediaAlunos();
				;
				break;

			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}

			// } while (opcao.equals("0") == false);
		} while (opcao != 0);
		System.out.println("Obrigado por usar o programa Lista de Exercício!");
	}

	// função soma
	public static void calculandoSoma() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter,  " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter); // convertendo tudo para byte, caso de erro mudar vari[avel para int

		}

	}

	private static void runRepeat20() {

		for (byte cont = 1; cont <= 20; cont++) {
			System.out.print("Eu gosto de algoritmos " + (cont % 5 == 0 ? "\n" : ""));

			/*
			 * if (cont % 5 == 0) {
			 *
			 * System.out.print("\n");
			 * }
			 */
		}
	}

	private static void somaDasIdades() {
		Scanner input = new Scanner(System.in);
		int somaIdade = 0;
		byte idade;

		for (byte count = 1; count <= 20; count++) {
			System.out.println("A soma neste laço foi " + somaIdade);
			System.out.println("Por favor, insira a idade: ");
			idade = input.nextByte();
			somaIdade = somaIdade + idade;

		}
		System.out.println("A soma total das idades foi " + somaIdade);
	}

	private static void maioresDeIdade() {
		Scanner input = new Scanner(System.in);
		System.out.println("Exibir apenas os maiores de idade");
		byte idade, cont, maiores = 0;

		for (cont = 1; cont <= 20; cont++) {
			System.out.println("Informe a idade da pessoa " + cont);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A última pessoa informada era de maior.");
			}
		}
		System.out.println("Entre " + (cont - 1) + " pessoas, apenas " + maiores + " são maiores de idade");
	}

	private static void exibirMaisNovo() {
		Scanner input = new Scanner(System.in);
		String name, youngerName = "valor";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 5; count++) {

			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + " por favor, Digite sua idade: ");
			age = input.nextByte();
			// no primeiro laço sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo laço já tenho como comparar com "ageMinimal"
				System.out.println("Estou no laço " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova é " + name + " com " + age + " anos");
					ageMinimal = age;
					youngerName = name;
				}

			}

		}
		System.out.println("Após isso tudo o mais novo é: " + youngerName + " " + ageMinimal);

	}


		private static void mediaAlunos() {
	        Scanner input = new Scanner(System.in);
	        byte qtd, contador = 0;
	        float nota, soma = 0f;
	        System.out.println("Quantas notas vc quer capturar?");
	        qtd = input.nextByte();
	        String resposta;
	        do {
	            contador++;
	            System.out.println("Informe uma nota");
	            nota = input.nextFloat();
	            if (contador >= qtd) {
	                System.out.println("Quer capturar mais alguma nota?");
	                resposta = input.next();
	                if (resposta.equals("sim")) {
	                    contador--;
	                }
	            }
	            soma = soma + nota;
	        } while (contador <= qtd);
	        System.out.println("Soma =" + soma);
	    }

}