package Exercicios_Laco;
import java.util.Scanner;

public class ClassExercicio4 {

	public static void main(String[] args) {
		
		int idade,genero,fatorPsico,contCalmo=0,contNerv=0,contHa=0,contNdc=0,contNerv40=0,contCalmo18=0, pessoas=1;
		
		Scanner leia=new Scanner(System.in);

		while(pessoas<=2) {
			System.out.println("\nColoque sua idade");
			idade=leia.nextInt();
			System.out.println("\nColoque seu gênero: (1) Feminino / (2)Masculino / (3) Não Declarado");
			genero=leia.nextInt();
			System.out.println("\nColoque seufator psicológico: (1) Calmo / (2)Nervosa / (3) Agressivo");
			fatorPsico=leia.nextInt();
			
			if(fatorPsico==1) {
				contCalmo++;
			}
			if(genero==1&&fatorPsico==2) {
				contNerv++;
			}
			if(genero==2&&fatorPsico==3) {
				contHa++;
			}
			if(genero==3&&fatorPsico==1) {
				contNdc++;
			}
			if(fatorPsico==2&&idade>40) {
				contNerv40++;
			}
			if(fatorPsico==1&&idade<18) {
				contCalmo18++;
			}
			pessoas++;
		}
		System.out.println("\nNúmero de pessoas calmas:"+contCalmo);
		System.out.println("\nNúmero de mulheres nervosas:"+contNerv);
		System.out.println("\nNúmero de homens agressivos:"+contHa);
		System.out.println("\nNúmero de pessoas não declaradas calmas:"+contNdc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos:"+contNerv40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos:"+contCalmo18);
	}

}
