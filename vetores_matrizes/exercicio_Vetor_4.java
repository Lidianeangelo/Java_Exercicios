/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

package exercicios_Vetores_Matrizes;
import java.util.Scanner;

public class exercicio_Vetor_4 {

    public static void main(String[] args) {

        int[][] numero = new int[3][3];
        int somaNumero = 0, linha, coluna, somaDiagonal = 0;

        Scanner ler = new Scanner(System.in);

        for (linha = 0; linha < 3; linha++) {

            for (coluna = 0; coluna < 3; coluna++) {

                System.out.println("Entre com um número na linha: " + linha + " e coluna: " + coluna);
                numero[linha][coluna] = ler.nextInt();

                if (numero[linha][coluna] > 0) {
                    somaNumero += numero[linha][coluna];
                }
                if (linha == coluna) {
                    somaDiagonal += numero[linha][coluna];
                }
            }
        }

        System.out.println("\n O somatório dos numeros é " + somaNumero);
        System.out.println("\n O somatório dos numeros da diagonal é " + somaDiagonal);
    }

} 

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
package exercicios_Vetores_Matrizes;

import java.util.Scanner;

public class exercicio_Matriz {

	public static void main(String[] args) {

		int[][] numero = new int[3][3];
		int linha = 0, coluna = 0; //contagem = 0;

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

				System.out.println("\nEntre com um número na linha: " + linha + " e coluna: " + coluna + " : ");
				numero[linha][coluna] = leia.nextInt();

				/*if (numero[linha][coluna] > 10) {
					contagem++;
					System.out.println("aqui" + contagem);
				}*/

			}

		}

	}
}

