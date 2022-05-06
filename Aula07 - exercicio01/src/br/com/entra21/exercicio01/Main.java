package br.com.entra21.exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um Exercício");
		System.out.println("1 - Calculadora");
		System.out.println("2 - Currículo");
		String opcMenu = sc.nextLine();

		switch (opcMenu) {
		case "1":
		case "calculadora":

			float n1, n2, operacao;

			System.out.println("Digite o primeiro número");
			n1 = sc.nextFloat();
			System.out.println("Digite o segundo número");
			n2 = sc.nextFloat();

			System.out.println("Escolha uma operação matemática");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Mutiplicar");
			System.out.println("4 - Dividir");
			System.out.println("");
			String opcao = sc.next();

			switch (opcao.toLowerCase()) {
			case "1":
			case "somar":
				operacao = n1 + n2;
				System.out.println("Resultado: " + operacao);
				break;
			case "2":
			case "subtrair":
				operacao = n1 - n2;
				System.out.println("Resultado: " + operacao);
				break;
			case "3":
			case "multiplicar":
				operacao = n1 * n2;
				System.out.println("Resultado: " + operacao);
				break;
			case "4":
			case "dividir":
				operacao = n1 / n2;
				System.out.println("Resultado: " + operacao);
				break;
			}
			break;

		case "2":
		case "currículo":
			
			cadastrarCurriculo();
			
			break;

		}

	}
	
	
	
	public static void cadastrarCurriculo() {
		
		Scanner sc = new Scanner(System.in);
		String nome, sexo, idade, cidade, profissao, formacao, empresasTrabalhou;
			
		System.out.println("Escreva seu currículo Aqui");
		System.out.println("Digite seu nome");
		nome = sc.nextLine();
		System.out.println("Sexo");
		sexo = sc.nextLine();
		System.out.println("Digite sua idade");
		idade = sc.nextLine();
		System.out.println("Digite sua cidade");
		cidade = sc.nextLine();
		System.out.println("Digite sua profissão");
		profissao = sc.nextLine();
		System.out.println("Sua formação");
		formacao = sc.nextLine();
		System.out.println("Empresas que já trabalhou");
		empresasTrabalhou = sc.nextLine();
		
		System.out.println("Dados do Currículo");
		System.out.println("NOME:" + nome);
		System.out.println("SEXO: " + sexo);
		System.out.println("IDADE: " + idade);
		System.out.println("CIDADE " + cidade);
		System.out.println("PROFISSÃO: " + profissao);
		System.out.println("FORMACAO: " + formacao);
		System.out.println("EXPERIÊNCIA: " + empresasTrabalhou);
	}


}
