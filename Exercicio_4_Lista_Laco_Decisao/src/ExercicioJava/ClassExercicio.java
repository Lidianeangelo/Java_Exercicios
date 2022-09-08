package ExercicioJava;

import java.util.Scanner;

public class ClassExercicio {

	public static void main(String[] args) {

		double resultado;
		int numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o número:");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			resultado = Math.sqrt(numero);
		} else {
			resultado = Math.pow(numero, 2);
		}
		System.out.println("\nO resultado é:" + resultado);
	}

}
