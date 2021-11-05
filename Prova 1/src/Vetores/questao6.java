package Vetores;

import java.util.Scanner;

public class questao6 {
	public static void main(String[] args) {
		int n = 0;
		int[] vetor= fibonacci (n);
		
		for (int i = 0; i < n; i++) {
			System.out.print(" [" + i + "] " + fibonacci.vetor);
		}
		System.out.println("\n \n");
		
		
	}
	
	
	public static int[] fibonacci (int n) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Quantas posições tem seu array?\n");
		
		n = leitura.nextInt();
		int[] vetor = new int[n];
		System.out.println("\n");
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = leitura.nextInt();
		}
		leitura.close();
		
		System.out.println("\n");
		
		for(int i=0; i<n; i++) {
			if (i<2)
				vetor[i]=i;
			else
				vetor[i] = vetor [i-1] + vetor [i-2];
		}
		
	
		
		return vetor;
	}
}
