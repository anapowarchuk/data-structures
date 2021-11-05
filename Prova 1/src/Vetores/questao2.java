package Vetores;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Qual a quantidade de posições do seu array?");

		Scanner leitura = new Scanner(System.in);
		n = leitura.nextInt();

		int[] vetor = new int[n];

		System.out.println("Digite " + n + " valores\n");
		for (int i = 0; i < n; i++) {
			vetor[i] = leitura.nextInt();
		}
		System.out.println("\n");

		System.out.println("Arranjo:");
		for (int j = 0; j < n; j++) {
			System.out.print(" [" + vetor[j] + "]");
		}
		System.out.println("\n");
		System.out.println("\n");

		System.out.println("Qual o valor que você deseja verificar as ocorrências?");
		System.out.println("\n");
		int valor;
		valor = leitura.nextInt();
		System.out.println("\n");
		
		leitura.close();

		int quantidade = contaOcorrenciasValor(vetor, valor);
		System.out.println("O valor " + valor + " aparece " + quantidade + " no array.");
	}

	public static int contaOcorrenciasValor(int vetor[], int valor) {
		int qtd = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				qtd++;
			}
		}
		return qtd;

	}
}
