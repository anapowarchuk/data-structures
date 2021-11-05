package Vetores;

import java.util.Scanner;

public class questao8 {
	public static void main(String args[]) {
		int n;
		Scanner leitura = new Scanner (System.in);
		System.out.println("Quantas posições tem seu array?\n");
		n=leitura.nextInt();
		int[] vetor = new int[n];
		System.out.println("\n");
		System.out.println("Digite " + n + " números" );
		for(int i=0; i<n; i++) {
		vetor[i]= leitura.nextInt();
		}
		leitura.close();
		System.out.println("\n");
		for(int i=0; i<n; i++) {
			System.out.print(" [" + vetor[i] + "] ");
		}
		
		System.out.println("\n \n");
		numerosPrimos(vetor);
	}
	
	public static void numerosPrimos (int []vetor) {
		for (int i = 0; i < vetor.length; i++) {
			boolean primo = true;
			for (int j = 2; j < vetor[i]; j++)
				if (vetor[i] % j == 0)
					primo = false;
			if (primo && vetor[i] > 0)
				System.out.print(" "+ vetor[i] + " é primo");
		}
	}
}

