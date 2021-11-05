package Lista2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int n;
		System.out.println("Quantos n�meros voc� deseja alocar no seu vetor?");
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		entrada.close();
		int vetor[] = new int[n];
		for (int cont0 = 0; cont0 < n; cont0++) {
			System.out.println("Qual n�mero voc� deseja alocar na posi��o " + cont0 + " do vetor?");
			Scanner teclado = new Scanner(System.in);
			vetor[cont0] = teclado.nextInt();
			teclado.close();
		}
		
		System.out.println("Vetor desordenado:");
		for (int cont = 0; cont < vetor[n]; cont++) {
			System.out.println(vetor[cont] + " ");
		}
		BubbleSort(vetor);
	}

	public static void BubbleSort(int[] vetor) {
		int aux;

		for (int cont = 0; cont < vetor.length; cont++) { // enquanto o a vari�vel cont for menor que o vetor, deve-se
															// acresentar um
			for (int cont2 = 0; cont2 < (vetor.length - 1); cont2++) { // aqui, o
				if (vetor[cont2] > vetor[cont2 + 1]) { // se o vetor na posi��o cont2 for maior que o vetor da pr�xima
														// posi��o
					aux = vetor[cont2];
					vetor[cont2] = vetor[cont2 + 1];
					vetor[cont2 + 1] = aux;
				}
			}
		}
		System.out.println("Vetor ordenado: ");

		for (int cont = 0; cont < vetor.length; cont++) {
			System.out.println(vetor[cont] + " ");
		}

	}
}