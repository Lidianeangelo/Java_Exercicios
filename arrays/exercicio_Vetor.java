package exemplo;

public class exercicio_Vetor {

	public static void main(String[] args) {
		//quantas posições no array
		int soma;
		int x;
		int [] A= new int [6];
		//declarando os valores no array
		A[0]=1;
		A[1]=0;
		A[2]=5;
		A[3]=-2;
		A[4]=-5;
		A[5]=7;
		
		System.out.println("\n o tamanho do vetor é: "+A.length);
		
		soma=A[0]+A[1]+A[5];
		System.out.println("\n a soma é: "+soma);
		
		A[4]= 100;  
		//System.out.println("\n a soma é: "+soma);
		
		for (x=0;x<6;x++){
			System.out.println("\n os números são: "+ A[x]);
			};
	
		
		
}
}

