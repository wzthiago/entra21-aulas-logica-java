package br.com.entra21.prova01;

import java.util.Scanner;

import javax.swing.DefaultListCellRenderer;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float n1, n2, operacao;

		System.out.println("Digite o primeiro n�mero");
		n1 = scanner.nextFloat();
		System.out.println("Digite o segundo n�mero");
		n2 = scanner.nextFloat();

		System.out.println("=================================");
		System.out.println("|        # MENU OPERA��ES #     |");
		System.out.println("=================================");
		System.out.println("|  01 - Somar                   |");
		System.out.println("|-------------------------------|");
		System.out.println("|  02 - Subtrair                |");
		System.out.println("|-------------------------------|");
		System.out.println("|  03 - Multiplicar             |");
		System.out.println("|-------------------------------|");
		System.out.println("|  04 - Dividir                 |");
		System.out.println("=================================" + "\n");

		String opcao = scanner.next();

		switch (opcao.toLowerCase()) {
		case "1":
		case "somar":
			somarNum(n1, n2);
			System.out.println("Resultado da soma: " + somarNum(n1, n2));
			break;
		case "2":
		case "subtrair":
			subtrairNum(n1, n2);
			System.out.println("Resultadoda da subtra��o : " + subtrairNum(n1, n2));
			break;
		case "3":
		case "multiplicar":
			multiplicarNum(n1, n2);
			System.out.println("Resultado da multiplica��o: " + multiplicarNum(n1, n2));
			break;
		case "4":
		case "dividir":
			dividirNum(n1, n2);
			System.out.println("Resultado da divis�o: " + dividirNum(n1, n2));
			break;

		default:
			System.out.println("Op��o Inv�lida!");
			break;
		}

	}

	public static float somarNum(float n1, float n2) {
		System.out.println("O calculo est� sendo executado...");
		return n1 + n2;
	}

	public static float subtrairNum(float n1, float n2) {
		System.out.println("O calculo est� sendo executado...");
		return n1 - n2;
	}

	public static float multiplicarNum(float n1, float n2) {
		System.out.println("O calculo est� sendo executado...");
		return n1 * n2;
	}

	public static float dividirNum(float n1, float n2) {
		System.out.println("O calculo est� sendo executado...");
		return n1 / n2;
	}

}
