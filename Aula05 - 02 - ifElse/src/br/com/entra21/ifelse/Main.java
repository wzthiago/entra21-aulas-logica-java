package br.com.entra21.ifelse;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo a usar o if com else");
		
		if(false) {
			System.out.println("Vai passar aqui quando a condi��o resultar em true");
		}else {
			System.out.println("Vai passar aqui quando a condi��o resultar em false");
		}
		
		byte idade=18;
		
		if(idade>17) {//� maior de idade?
			System.out.println("� de maior");
		}else {
			System.out.println("N�o � permitido menores aqui!!!");
		}

	}

}
