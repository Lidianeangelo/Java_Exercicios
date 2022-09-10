package Exercicios_Laco;
import java.util.Scanner;

public class ClassExercicio6 {
	public static void main(String[] args) {
		 int numeros, contMult3=0,somaMult3=0;
		 float mediaMult3=0;
		 
		 Scanner leia=new Scanner(System.in);
		 System.out.println("\nEntre com um número");
		 numeros=leia.nextInt();
		 
		 do {
			 
			 if(numeros==0) {
				 System.out.println("\nSaiu do loop!");
			 }else {
				 if(numeros%3==0) {
					 somaMult3+=numeros;
					 contMult3++;
				 }
				 System.out.println("\nEntre com um número");
				 numeros=leia.nextInt();
			 }
		 }
		 while(numeros!=0);
		 
		
}
}