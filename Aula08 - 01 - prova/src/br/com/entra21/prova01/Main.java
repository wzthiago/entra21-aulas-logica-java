/* Crie um programa que informe o signo do usuário Capturar nome , dia e mês de aniversário
   Criar constante para numero limite do dia do mês, no caso 31
   Se 
   o dia for maior que o limite
   Informar o valor limite para um dia do mês
   Senão
   escolher o mês correspondente para fazer as validações especificas
   nesse mês existe esse dia?
   com base no dia do mês qual é o signo
   mês invalido
*/

package br.com.entra21.prova01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final byte LIMITE_DIA = 31;
		Scanner entrada = new Scanner(System.in);

		String nome;
		byte dia;

		System.out.println("Digite o seu Nome:");
		nome = entrada.nextLine();

		System.out.println(nome + ", por favor, digite o dia do seu aniversário");
		dia = entrada.nextByte();
		if (dia > LIMITE_DIA) {
			System.out.println(
					"Não existe nenhum mês no calendário com mais de 31 dias. Dia Inválido, você digitou: " + dia);
			main(null);

		} else {

			rodarOpcoes(nome, dia);
		}
	}

	public static void rodarOpcoes(String nome, byte dia) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("================================================");
		System.out.println("|        DIGITE O MÊS DO SEU ANIVERSÁRIO       |");
		System.out.println("================================================");
		System.out.println("| 01 - Janeiro   | 05 - Maio   | 09 - Setembro |");
		System.out.println("| 02 - Fevereiro | 06 - Junho  | 10 - Outubro  |");
		System.out.println("| 03 - Março     | 07 - Julho  | 11 - Novembro |");
		System.out.println("| 04 - Abril     | 08 - Agosto | 12 - Dezembro |");
		System.out.println("================================================");
		String opcaoMes = entrada.nextLine();

		switch (opcaoMes.toLowerCase()) {
		case "1", "01", "janeiro":
			validarTrintaUm(dia, nome, 1);
			break;

		case "2", "02", "fevereiro":
			validarVinteOito(dia, nome, 2);
			break;

		case "3", "03", "marco":
			validarTrintaUm(dia, nome, 3);
			break;

		case "4", "04", "abril":
			validarTrinta(dia, nome, 4);
			break;

		case "5", "05", "maio":
			validarTrintaUm(dia, nome, 5);
			break;

		case "6", "06", "junho":
			validarTrinta(dia, nome, 6);
			break;
		case "7", "07", "julho":
			validarTrintaUm(dia, nome, 7);
			break;

		case "8", "08", "Agosto":
			validarTrintaUm(dia, nome, 8);
			break;

		case "9", "09", "setembro":
			validarTrinta(dia, nome, 9);
			break;

		case "10", "outubro":
			validarTrintaUm(dia, nome, 10);
			break;

		case "11", "novembro":
			validarTrinta(dia, nome, 11);
			break;

		case "12", "dezembro":
			validarTrintaUm(dia, nome, 12);
			break;

		default:
			System.out.println("Opção Inválida, você digitou, " + opcaoMes);
			main(null);
			break;
		}
		
		rodarNovamente();

	}

	public static void rodarNovamente() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Deseja rodar novamente o programa? (Sim ou No)");
		switch (scanner.nextLine().toLowerCase()) {
		case "sim":
			main(null);
			break;
		
		case "Não":
			System.out.println("Obrigado por usar o programa!");
			break;

		default:
			System.out.println("Por favor, responda com uma das opções ");
			rodarNovamente();
			break;

		}
	}

	public static void validarVinteOito(byte dia, String nome, int mes) {
		final byte MAX_28 = 28;
		if (dia > MAX_28) {
			System.out.println("Por favor, entre com o valor válido, mês com 28 dias");
			rodarOpcoes(nome, dia);
		} else {
			verificarSigno(dia, nome, mes);
		}
	}

	public static void validarTrinta(byte dia, String nome, int mes) {
		final byte MAX_30 = 30;
		if (dia > MAX_30) {
			System.out.println("Por favor, entre com o valor válido, mês com 30 dias");
			rodarOpcoes(nome, dia);
		} else {
			verificarSigno(dia, nome, mes);
		}
	}

	public static void validarTrintaUm(byte dia, String nome, int mes) {
		final byte MAX_31 = 31;
		if (dia > MAX_31) {
			System.out.println("Por favor, entre com o valor válido, mês com 31 dias");
			rodarOpcoes(nome, dia);
		} else {
			verificarSigno(dia, nome, mes);
		}
	}

	public static void verificarSigno(byte dia, String nome, int mes) {

		if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 1)) { // Capricornio
			System.out.println("Seu signo é: Capricornio");
		} else if ((dia >= 21 && mes == 1) || (dia <= 19 && mes == 2)) { // Aquario
			System.out.println("Seu signo é: Aquário");
		} else if ((dia >= 20 && mes == 2) || (dia <= 20 && mes == 3)) { // Peixes
			System.out.println("Seu signo é: Peixes");
		} else if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4)) { // Aries
			System.out.println("Seu signo é: Áries");
		} else if ((dia >= 21 && mes == 4) || (dia <= 20 && mes == 5)) { // Touro
			System.out.println("Seu signo é: Touro");
		} else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) { // Gemeos
			System.out.println("Seu signo é: Gemeos");
		} else if ((dia >= 21 && mes == 6) || (dia <= 21 && mes == 7)) { // Cancer
			System.out.println("Seu signo é: Cancer");
		} else if ((dia >= 22 && mes == 7) || (dia <= 22 && mes == 8)) { // Leao
			System.out.println("Seu signo é: Leão");
		} else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) { // Virgem
			System.out.println("Seu signo é: Virgem");
		} else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) { // Libra
			System.out.println("Seu signo é: Libra");
		} else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) { // Escorpião
			System.out.println("Seu signo é: Escorpião");
		} else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) { // Sagitario
			System.out.println("Seu signo é: Sagitario");

		}

	}

}
