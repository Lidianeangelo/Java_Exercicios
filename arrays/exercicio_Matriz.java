/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
package exemplo;

import java.util.Scanner;

public class exercicio_Matriz {

	public static void main(String[] args) {

		int[][] numero = new int[3][3];
		int linha = 0, coluna = 0, contagem=0;

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

				System.out.println("\nEntre com um número na linha: " + linha + " e coluna: " + coluna + " : ");
				numero[linha][coluna] = leia.nextInt();

			

		}

	}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
		 if (linha > 10 && coluna > 10) { 
			  contagem++;
			  System.out.println("aqui" +contagem);
			

		}}}

}
}
