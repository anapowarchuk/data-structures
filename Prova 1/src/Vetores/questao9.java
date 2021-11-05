package Vetores;

import java.util.Scanner;

public class questao9 {
	public static void main(String[] args) {
		int[] vetorA = new int[5];
		String[] vetorB = new String[5];
		int[] vetorC = new int[5];
		double[] vetorD = new double[5];

		operacoes(vetorA, vetorB, vetorC, vetorD);
	}

	public static void operacoes(int[] vetorA, String[] vetorB, int[] vetorC, double[] vetorD) {
		Scanner leitura = new Scanner(System.in);
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Posição " + cont);
			System.out.println("Qual o valor do elemento do vetor A?");
			vetorA[cont] = leitura.nextInt();
			System.out.println("Qual a operação? |A - ADIÇÃO|B - SUBTRAÇÃO|C - MULTIPLICAÇÃO| D - DIVISÃO| ");
			vetorB[cont] = leitura.next();
			System.out.println("Qual o valor do elemento do vetor B");
			vetorC[cont] = leitura.nextInt();

			if (vetorB[cont] == "A") {
				vetorD[cont] = (vetorA[cont] + vetorC[cont]);
			} else if (vetorB[cont] == "B") {
				vetorD[cont] = (vetorA[cont] - vetorC[cont]);
			} else if (vetorB[cont] == "C") {
				vetorD[cont] = vetorA[cont] * vetorC[cont];
			} else if (vetorB[cont] == "D") {
				if (vetorC[cont] != 0) {
					vetorD[cont] = vetorA[cont] / vetorC[cont];
				}
			}
		}
		leitura.close();
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("[ " + vetorD[cont] + " ]");
		}
	}
}
