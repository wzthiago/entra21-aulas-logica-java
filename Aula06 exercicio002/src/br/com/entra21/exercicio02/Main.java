package br.com.entra21.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final byte QNT_NOTAS = 3;
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, media;
		
		System.out.println("Digite o nome :");
		String nome = sc.nextLine();
		
		System.out.println("Digite a primeira nota : ");
		n1 = sc.nextFloat();		
		System.out.println("Digite a segunda nota : ");
		n2 = sc.nextFloat();
		System.out.println("Digite a terceira nota : ");
		n3 = sc.nextFloat();
		
		media = (n1 + n2 + n3) / QNT_NOTAS;
		
		System.out.println(nome);
		
		if(media < 3) {
			System.out.println("Você Reprovou");
		}else if (media < 7) {
			System.out.println("Está em recuperação");
		}else if (media == 7) {
			System.out.println("Passou com a nota mínima");
		}else if (media < 7) {
			System.out.println("Poderia ter ido melhor");
		}else if (media == 10) {
			System.out.println("Parabéns!!!");
			
		
			
		}
		
		
	}

}
