package br.com.entra21.elseif;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre else if (ou seja renovando o if antes do else)");

		float altura = 1.7f;
		double dinheiro = 1000f;

		if (altura < 1.5f) {// � baixinho ?
			System.out.println("� bem baixinho");
		} else if (altura <= 1.9f) {// � alto
			System.out.println("� alto");
		} else {
			// mesmo que eu nao queira fazer nada aqui, � uma boa pr�tica ter o else
		}

		// se ate 1200 , ate 1800 , ate 2000, qualquer valor acima
		byte pontos;
		String mensagem;
		if (dinheiro <= 1200) {
			mensagem = "salario minimo";
			pontos = 5;
		} else if (dinheiro <= 1800) {
			mensagem = "ta ficando rico";
			pontos = 8;
		} else if (dinheiro <= 2000) {
			mensagem = "me empresta :) ";
			pontos = 12;
		} else {
			mensagem = " me contrata vai";
			pontos = 13;
		}

		System.out.println(mensagem);
		System.out.println("sua pontua��o " + pontos);

		if (dinheiro <= 1200) {
			mensagem = "salario minimo";
			  
		}

		if (dinheiro <= 1800) {
			mensagem = "ta ficando rico";
		}
		
		 

	}

}
