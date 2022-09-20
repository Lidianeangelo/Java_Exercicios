/*Exercício 8:O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/
package exercicios;

import java.util.Scanner;

public class exercicio_1 {


	public static void main(String[] args) {
		Double custoCarro=0.0,custoFab=0.0,distrib=0.0,impost=0.0;
		Scanner leia =new Scanner (System.in);
		System.out.println("Escreva aqui o custo de fábrica do carro: R$");
		custoFab=leia.nextDouble();
		
		distrib=(custoFab*28)/100;
		impost=(custoFab*45)/100;
		custoCarro=custoFab+distrib+impost;
		
		System.out.println("\nO carro custa: R$ "+custoCarro);

	}

}
