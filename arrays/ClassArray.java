package exemplo;

import java.util.Scanner;

public class ClassArray {

	public static void main(String[] args) {

		int[][] numero = new int[2][3];
		int somaNumero = 0, linha, coluna;

		Scanner leia = new Scanner(System.in);
		leia.nextInt();

		for (linha = 0; linha < 2; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nEntre com um número na linha "+linha+" coluna "+coluna+":");
				numero[linha][coluna] = leia.nextInt();
				if (numero[linha][coluna] > 0) {
					somaNumero += numero[linha][coluna];
				}

			}
		}
		System.out.printf("\nSomatória dos números maior que 0: "+somaNumero);

	}

}
