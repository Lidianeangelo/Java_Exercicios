//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package Exercicios_Laco;

import java.util.Scanner;

public class ClassExercicio_2 {

	public static void main(String[] args) {

		int x;
		float num = 0, numPar = 0, numImpar = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEscreva 10 números:");

		for (x = 1; x <= 10; x++) {

			num = leia.nextFloat();

			if (num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}

		}
		System.out.printf("\nNúmeros pares:" + numPar);
		System.out.printf("\nNúmeros ímpares:" + numImpar);

	}

}
