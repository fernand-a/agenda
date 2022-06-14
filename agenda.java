package Agenda;

import java.util.Scanner;

public class Agenda {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String agenda[][] = new String[10][5];
		
		//declaracao de variaveis
		int linha, coluna;

    //laco de repeticao
		for (linha = 0; linha < 3; linha++) {
		    
		  // exibicao de texto na tela
			System.out.print("informe seu nome: ");
			agenda[linha][0] = leia.nextLine();

			System.out.print("informe seu endereco: ");
			agenda[linha][1] = leia.nextLine();

			System.out.print("informe seu codigo postal: ");
			agenda[linha][2] = leia.nextLine();

			System.out.print("informe seu bairro: ");
			agenda[linha][3] = leia.nextLine();

			System.out.print("informe seu telefone: ");
			agenda[linha][4] = leia.nextLine();
		}

    // exibicao de texto na tela
		System.out.printf("\n   nome, endereco, codigo postal, bairro, telefone	");
		for (linha = 0; linha < 3; linha++) {
			System.out.printf("\n %d", linha);

			for (coluna = 0; coluna < 5; coluna++) {
				System.out.printf(" %s,", agenda[linha][coluna]);
			}
		}

	}
}
