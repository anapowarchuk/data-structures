package Vetores;

import java.util.Scanner;

public class questao4 {
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
		leitura.close();

		System.out.println("Arranjo:");
		for (int j = 0; j < n; j++) {
			System.out.print(" [" + vetor[j] + "]");
		}
		System.out.println("\n");
		System.out.println("\n");
		
		int posicaoMaiorElem = retornaPosicaoMaiorElemento(vetor);
		System.out.println(posicaoMaiorElem+1);
		
	}
	
	public static int retornaPosicaoMaiorElemento (int[] vetor) {
		int maiorPo = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					maiorPo = i;
				}
				else if (vetor[i]==vetor[j]) {
					maiorPo=i;
				}
				else 
					maiorPo=j;
			}
		}
		return maiorPo;
	}
}
