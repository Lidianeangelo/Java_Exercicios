package exercicio1;

import java.util.Scanner;

public class ClassExercicio {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInsira o primeiro número:");
		num1 = leia.nextInt();

		System.out.println("\nInsira o segundo número:");
		num2 = leia.nextInt();

		System.out.println("\nInsira o terceiro número:");
		num3 = leia.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("\nO primeiro número é maior!");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("\nO segundo número é maior!");
		} else {
			System.out.println("\nO terceiro número é maior!");
		}

	}
}
