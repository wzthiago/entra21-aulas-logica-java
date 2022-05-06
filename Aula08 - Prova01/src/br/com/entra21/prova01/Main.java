/* Crie um programa que informe o signo do usu�rio Capturar nome , dia e m�s de anivers�rio
   Criar constante para numero limite do dia do m�s, no caso 31
   Se 
   o dia for maior que o limite
   Informar o valor limite para um dia do m�s
   Sen�o
   escolher o m�s correspondente para fazer as valida��es especificas
   nesse m�s existe esse dia?
   com base no dia do m�s qual � o signo
   m�s invalido
*/

package br.com.entra21.prova01;

import java.util.Scanner;

import javax.swing.DefaultListCellRenderer;

public class Main {

	public static void main(String[] args) {

		final byte LIMITE_DIA = 31;
		final byte LIMITE_MES = 12;
		Scanner entrada = new Scanner(System.in);
		String opcaoMenu;

		System.out.println("=================================");
		System.out.println("|        # MENU PROVA #         |");
		System.out.println("=================================");
		System.out.println("| 01 - Signo                    |");
		System.out.println("|-------------------------------|");
		System.out.println("| 02 - Calculadora              |");
		System.out.println("=================================" + "\n");
		opcaoMenu = entrada.nextLine();

		switch (opcaoMenu.toLowerCase()) {
		case "1":
		case "signo":

			String nome;
			byte dia, mes;

			System.out.println("Digite o seu Nome:");
			nome = entrada.nextLine();
			System.out.println("\n" + "Bem Vindo: " + nome + "\n");
			
			System.out.println("Digite o dia de nascimento");
			dia = entrada.nextByte();
			
			if(dia > LIMITE_DIA) {
			System.out.println("N�o existe nenhum m�s no calend�rio com mais de 31 dias. Dia Inv�lido, voc� digitou: " + dia);
			}else{
			System.out.println("Digite o m�s de nascimento");
			mes = entrada.nextByte();
			if(mes > LIMITE_MES) {
			System.out.println("S� existe 12 meses no Ano. M�s Inv�lido, voc� digitou: " + mes );
			}
	
			if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 1)) { // Capricornio
				System.out.println("Seu signo �: Capricornio");
			} else if ((dia >= 21 && mes == 1) || (dia <= 19 && mes == 2)) { // Aquario
				System.out.println("Seu signo �: Aqu�rio");
			} else if ((dia >= 20 && mes == 2) || (dia <= 20 && mes == 3)) { // Peixes
				System.out.println("Seu signo �: Peixes");
			} else if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4)) { // Aries
				System.out.println("Seu signo �: �ries");
			} else if ((dia >= 21 && mes == 4) || (dia <= 20 && mes == 5)) { // Touro
				System.out.println("Seu signo �: Touro");
			} else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) { // Gemeos
				System.out.println("Seu signo �: Gemeos");
			} else if ((dia >= 21 && mes == 6) || (dia <= 21 && mes == 7)) { // Cancer
				System.out.println("Seu signo �: Cancer");
			} else if ((dia >= 22 && mes == 7) || (dia <= 22 && mes == 8)) { // Leao
				System.out.println("Seu signo �: Le�o");
			} else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) { // Virgem
				System.out.println("Seu signo �: Virgem");
			} else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) { // Libra
				System.out.println("Seu signo �: Libra");
			} else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) { // Escorpi�o
				System.out.println("Seu signo �: Escorpi�o");
			} else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) { // Sagitario
				System.out.println("Seu signo �: Sagitario");
			
			}
			}
			break;
			
			
			
		case "2":
		case "calculadora":
			float n1, n2, operacao;

			System.out.println("Digite o primeiro n�mero");
			n1 = entrada.nextFloat();
			System.out.println("Digite o segundo n�mero");
			n2 = entrada.nextFloat();

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

			String opcao = entrada.next();

			switch (opcao.toLowerCase()) {
			case "1":
			case "somar":
				float resultado = somarNum(n1, n2);
				System.out.println("Resultado da soma: " + resultado);
				break;
			case "2":
			case "subtrair":
				resultado = subtrairNum(n1, n2);
				System.out.println("Resultadoda da subtra��o : " + resultado);
				break;
			case "3":
			case "multiplicar":
				resultado = multiplicarNum(n1, n2);
				System.out.println("Resultado da multiplica��o: " + resultado);
				break;
			case "4":
			case "dividir":
				resultado = dividirNum(n1, n2);
				System.out.println("Resultado da divis�o: " + resultado);
				break;
			}
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
