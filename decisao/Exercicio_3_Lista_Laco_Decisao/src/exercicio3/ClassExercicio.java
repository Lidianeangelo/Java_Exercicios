package exercicio3;

import java.util.Scanner;

public class ClassExercicio {

	public static void main(String[] args) {
		int idade = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInsira sua idade:");
		idade = leia.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("\nTurma: Infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("\nTurma: Juvenil");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("\nTurma: Adultes");
		} else {
			System.out.println("\nIdade fora de turma");
		}
	}

}
