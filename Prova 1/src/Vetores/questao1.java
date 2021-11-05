package Vetores;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
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
		int contador = contaNegativos(vetor);
		System.out.println("Há " + contador + " elementos negativos");
		
	}

	public static int contaNegativos(int vetor[]) {
		int cont = 0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]<0) {
				cont ++;
			}
		}
		return cont;
	}
}
