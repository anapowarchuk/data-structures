package Vetores;

import java.util.Scanner;

public class questao7 {
	public static void main(String[] args) {
		int n;
		int m;
		
		Scanner leitura = new Scanner (System.in);
		//VETOR A
		System.out.println("Quantas posições tem seu array A?\n");
		n=leitura.nextInt();
		int[] vetorA = new int[n];
		System.out.println("\n Digite " + n + " palavras" );
		for(int i=0; i<n; i++) {
		vetorA[i]= leitura.nextInt();
		}
		System.out.println("\nVetor A");
		for(int i=0; i<n; i++) {
			System.out.print(" [" + vetorA[i] + "] ");
		}
		System.out.println("\n \n");
		
		//VETOR B
		System.out.println("Quantas posições tem seu array B?\n");
		m=leitura.nextInt();
		int[] vetorB = new int[m];
		System.out.println("\nDigite " + m + " palavras" );
		for(int i=0; i<n; i++) {
		vetorB[i]= leitura.nextInt();
		}
		leitura.close();
		System.out.println("\nVetor B");
		for(int i=0; i<m; i++) {
			System.out.print(" [" + vetorB[i] + "] ");
		}
		System.out.println("\n \n");
		combinacoes(vetorA, vetorB);
		
		
	}

	public static void combinacoes (int[] vetorA, int[] vetorB) {
		for(int i=0; i<vetorA.length; i++) {
			for(int j=0; j<vetorB.length; j++) {
			System.out.println(vetorA[i] + " " + vetorB[j]);
			}
		}
	}
}
