package br.com.entra21.operadores.aritimeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Operadores aritm�ticos");

		System.out.println("Realizando uma soma " + (1 + 7));
		System.out.println(4 + 10);

		float numeroA, numeroB;
		float calculoSoma;
		float resto;

		// objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso
		// ao teclado
		Scanner entrada = new Scanner(System.in);
		// new Scanner significa construa um objeto da classe Scanner e atribua na
		// variavel entrada

		System.out.println("Informe o numero A:");
		numeroA = entrada.nextFloat();

		System.out.println("Informe o numero B:");
		numeroB = entrada.nextFloat();

		System.out.println("A soma entre esses 2 numeros � " + (numeroA + numeroB));
		calculoSoma = numeroA + numeroB;

		System.out.println("Outra forma de exibir essa soma � " + calculoSoma);

		System.out.println("A subtra��o entre esses 2 numeros � " + (numeroA - numeroB));

		System.out.println("Multiplica��o " + numeroA * numeroB);

		System.out.println("Divis�o " + numeroA / numeroB);

		resto = numeroA % numeroB;

		System.out.println("O resto da divis�o " + resto);

		boolean ehDivisivel = numeroA % numeroB == 0;
		
		System.out.println("� divisivel entre si ?" + ehDivisivel);

	}

}
