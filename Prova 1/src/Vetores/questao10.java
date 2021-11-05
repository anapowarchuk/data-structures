package Vetores;

import java.util.Scanner;

public class questao10 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int valor = (int) (Math.random() * 100);
		System.out.println("Digite 5 valores por linha");
		Scanner leitura = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Linha " + i);
			for (int j = 0; j < 5; j++) {
				array[j][i] = valor;
				valor = leitura.nextInt();
			}
		}
		leitura.close();
		imprimir(array);
		imprimirdp(array);
		imprimirds(array);
		minmax(array);

	}

	public static void imprimir(int[][] array) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("[ " + array[j][i] + " ]");
			}
			System.out.println("\n");
		}
	}

	public static void imprimirdp(int[][] array) {
		System.out.println("Diagonal principal:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.print("[ " + array[j][i] + " ]");
				}
			}
			System.out.println("\n");
		}
	}

	public static void imprimirds(int[][] array) {
		System.out.println("Diagonal secundaria:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j == array.length - 1) {
					System.out.print("[ " + array[j][i] + " ]");
				}
			}
			System.out.println("\n");
		}
	}

	public static void minmax(int[][] array) {
		int maior = array[0][0];
		int linha = 0;
		int menor;

		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array.length; j++)
				if (array[i][j] > maior) {
					maior = array[i][j];
					linha = i;
				}

		menor = array[linha][0];
		for (int j = 1; j < array.length; j++)
			if (array[linha][j] < menor)
				menor = array[linha][j];

		System.out.println("O elemento minmax é:" + menor);
	}
}
