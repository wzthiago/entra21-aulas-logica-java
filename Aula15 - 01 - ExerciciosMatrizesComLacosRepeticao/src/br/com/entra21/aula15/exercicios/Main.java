package br.com.entra21.aula15.exercicios;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		byte opcao;

		do {
			System.out.println(escreverMenu());
			opcao = input.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				criarMatrizes2Niveis();
				break;

			case 2:
				initializeMatrizTwoLevel1();
				break;
				
			case 3:
				criarMatrizes5vetores3posicoes();
				break;
				
			case 4:
				solicitarTamanhoMatrizParaPreencher();
				break;
				
			case 6:	
				atribuirAleatoriamenteValoresDetalhesVetores() ;
				break;
				
			default:
				System.out.println("Opções de 0 a 2");
				break;
			}

		} while (opcao != 0);
		System.out.println("Obrigado por usar o programa!");
	}

	public static String escreverMenu() {
		String conteudoMenu = "Aprendendo Matrizes usando Laços de Repetição";
		conteudoMenu += "\n 0 ou Sair - Para sair do programa...";
		conteudoMenu += "\n 1 - Criar matrizes de 2 níveis para cada tipo primitivo e exibir o tamanho deles no console";
		conteudoMenu += "\n 2 - Criar matrizes de 2 níveis inicializados para cada tipo primitivo e exibir o tamanho deles no console";
		conteudoMenu += "\n 3 - Criar 1 matriz de 5 posições com 3 itens de capacidade, para que o usuário alimente esses valores";
		conteudoMenu += "\n 4 - Criar uma matriz com o tamanho e capacidade informada pelo usuário e depois solicitar que o usuário informe os respectivos valores";
		conteudoMenu += "\n 6 - ...";
		return conteudoMenu;
	}

	private static void criarMatrizes2Niveis() {
		char matrizChars[][] = new char[2][3]; // dois vetores onde cada um pode armazenar 3 valores
		boolean matrizBooleans[][];
		matrizBooleans = new boolean[2][4]; // dois vetores onde cada um armazena 4 valores lógicos
		byte matrizBytes[][] = new byte[2][4];
		short matrizShorts[][] = new short[2][2];
		int matrizInts[][] = new int[3][2];
		long matrizLongs[][] = new long[3][2];
		float matrizFloats[][] = new float[2][6];
		double matrizDoubles[][] = new double[3][3];

		System.out.println(
				"matrizChars tamanho = " + matrizChars.length + " e cada vetor tem tamanho " + matrizChars[0].length);
		System.out.println("matrizBooleans tamanho = " + matrizBooleans.length + " e cada vetor tem tamanho "
				+ matrizBooleans[0].length);
		System.out.println(
				"matrizBytes tamanho = " + matrizBytes.length + " e cada vetor tem tamanho " + matrizBytes[0].length);
		System.out.println("matrizShorts tamanho = " + matrizShorts.length + " e cada vetor tem tamanho "
				+ matrizShorts[0].length);
		System.out.println(
				"matrizInts tamanho = " + matrizInts.length + " e cada vetor tem tamanho " + matrizInts[0].length);
		System.out.println(
				"matrizLongs tamanho = " + matrizLongs.length + " e cada vetor tem tamanho " + matrizLongs[0].length);
		System.out.println("matrizFloats tamanho = " + matrizFloats.length + " e cada vetor tem tamanho "
				+ matrizFloats[0].length);
		System.out.println("matrizDoubles tamanho = " + matrizDoubles.length + " e cada vetor tem tamanho "
				+ matrizDoubles[0].length);
		System.out.println("-----------------------------------------------------------------");

	}

	private static void initializeMatrizTwoLevel1() {

		char matrizChars[][] = { // quem define o tamanho para cada vetor é a inicialização, que pode ser									// irregular
				{ 'a', 'e', 'i' }, 
				{ 'R', 'D', 'O' }, 
				{ 'f', 'f', 'c', 'a' } // irregular porque tem tamanhos diferentes																				// de index
		};

		boolean matrizBooleans[][] = { 
				{ true, false, true, false }, 
				{ true, false, true, false },
				{ true, false, true, false } // regular porque todos a mesma capacidade de itens por vetores
		};

		byte matrizBytes[][] = { 
				{ 1, 2, 3, 4, 5, }, 
				{ 10, 20, 30 }, 
				{ 12, 13 }
				};

		short matrizShorts[][] = { 
				{ 300, 400, 1000 }, 
				{ 500, 600, 100 }, 
				{ 1000, 4000, 5000 } 
				};

		int matrizInts[][] = { 
				{ 23123, 55555 }, 
				{ 10111, 22222, 12456 }, 
				{ 81726, 7467, 12345 } 
				};

		long matrizLongs[][] = { 
				{33300, 453463}, 
				{445555, 1192098}, 
				{3455, 2525, 1786736} 
				};
		
		float matrizFloats [][]= {
				{1000.67f, 15827.34f},
				{2000.55f, 4768.45f},
				};
		
		double matrizDoubles[][]= {
				{1000, 1582},
				{20003, 4768},
				{4548, 798722}
		};
		
		System.out.println(
				"matrizChars tamanho = " + matrizChars.length + " e cada vetor tem tamanho " + matrizChars[0].length);
		System.out.println("matrizBooleans tamanho = " + matrizBooleans.length + " e cada vetor tem tamanho "
				+ matrizBooleans[0].length);
		System.out.println(
				"matrizBytes tamanho = " + matrizBytes.length + " e cada vetor tem tamanho " + matrizBytes[0].length);
		System.out.println("matrizShorts tamanho = " + matrizShorts.length + " e cada vetor tem tamanho "
				+ matrizShorts[0].length);
		System.out.println(
				"matrizInts tamanho = " + matrizInts.length + " e cada vetor tem tamanho " + matrizInts[0].length);
		System.out.println(
				"matrizLongs tamanho = " + matrizLongs.length + " e cada vetor tem tamanho " + matrizLongs[0].length);
		System.out.println("matrizFloats tamanho = " + matrizFloats.length + " e cada vetor tem tamanho "
				+ matrizFloats[0].length);
		System.out.println("matrizDoubles tamanho = " + matrizDoubles.length + " e cada vetor tem tamanho "
				+ matrizDoubles[0].length);
		System.out.println("-----------------------------------------------------------------");

	}
	
	//Criar 1 matriz de 5 posições com 3 itens de capacidade, para que o usuário alimente esses valores
	private static void criarMatrizes5vetores3posicoes() {
		
		byte matrizBytes[][] = new byte[5][3];
		
		System.out.println("Para o primeiro vetor, informe o valor: ");
		matrizBytes[0][0] = input.nextByte();
		
		System.out.println("Para o primeiro vetor, informe o valor: ");
		matrizBytes[0][1] = input.nextByte();
		
		System.out.println("Para o primeiro vetor, informe o valor: ");
		matrizBytes[0][2] = input.nextByte();
		
		//
		
		System.out.println("Para o segundo vetor, informe o valor: ");
		matrizBytes[1][0] = input.nextByte();
		
		System.out.println("Para o segundo vetor, informe o valor: ");
		matrizBytes[1][1] = input.nextByte();
		
		System.out.println("Para o segundo vetor, informe o valor: ");
		matrizBytes[1][2] = input.nextByte();
		
		for(byte vetor=2; vetor < matrizBytes.length; vetor++) {//[2][3][4] continuando minha captura com FOR
			
			for(byte detail=0; detail < matrizBytes[vetor].length; detail++) {
				
				System.out.println("Para o " +(vetor+1)+ "º vetor informe o "+(detail+1)+"º valor");
				matrizBytes[vetor][detail]= input.nextByte();
						
			}
			
		}
		
	}
	
	//Criar uma matriz com o tamanho e capacidade informada pelo usuário 
	//e depois solicitar que o usuário informe os respectivos valores
	
	public static void solicitarTamanhoMatrizParaPreencher() {
		
		byte tamanhoVetor, tamanhoDetalhe;
		byte matrizBytes [][];
		
		System.out.println("Quantos vetores vc quer na sua matriz: ");
		tamanhoVetor = input.nextByte();
		System.out.println("Quantos itens vc quer em cada vetor: ");
		tamanhoDetalhe= input.nextByte();
		
		matrizBytes = new byte [tamanhoVetor][tamanhoDetalhe];
		
		for(byte vetor =0; vetor< matrizBytes.length; vetor++) {
			
			for(byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {
				
				System.out.println("Para o indice [" +vetor+ "] detalhe [" +detalhe+ "] informe o valor ");
				matrizBytes[vetor][detalhe]= input.nextByte();
			}
		}
		
		for(byte vetor =0; vetor< matrizBytes.length; vetor++) {
			
			for(byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {
				
				System.out.println("Matriz bytes [" +vetor+ "] detalhe [" +detalhe+ "] ==> " + matrizBytes[vetor][detalhe]);
				
			}
		}
		
	}
	
	
	public static void atribuirAleatoriamenteValoresDetalhesVetores() {
	       
        byte matrizBytes[][]= new byte [30][10];
        String resposta;
        byte vetor=0, detalhe=0;
              
        do {
            System.out.println("Para o vetor " +vetor+ " e detalhe " +detalhe+ " informe o valor");
            matrizBytes[vetor][detalhe] = input.nextByte();
           
            System.out.println("Gostaria de inicializar outro valor ?");
            resposta = input.next();
            if(resposta.equalsIgnoreCase("sim")) {
                System.out.println("Qual vetor você quer acessar?");
                vetor = input.nextByte();
                System.out.println("Qual detalhe deste vetor você quer atualizar o valor?");
                detalhe = input.nextByte();
               
               
               
            }
        }while(resposta.equalsIgnoreCase("sim"));
       
       
               
       
       
    }
	

}