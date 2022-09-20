/*Exercício 4: Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D=R+S/2 onde R=(A+B)2 E S=(B+C)2*/

package exercicios;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {

		int A,B,C,S,R,D;
		
		Scanner leia=new Scanner(System.in);
		System.out.println("\n Insira o primeiro número: ");
		A=leia.nextInt();
		
		System.out.println("\n Insira o segundo número: ");
		B=leia.nextInt();
		
		System.out.println("\n Insira o terceiro número: ");
		C=leia.nextInt();
		
		S=(int) Math.pow((B+C), 2);
		R=(int) Math.pow((A+B), 2);
		D=S+R;
		System.out.println("\n Resultado: "+D);
		
		
	}

	

}
