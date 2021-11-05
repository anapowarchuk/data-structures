package Vetores;

import java.util.Scanner;

public class questao5 {
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
		
		double media = mediaAritmetica (vetor);
		System.out.println("A média artimética dos vetores é "+ media);
		
		double desvio=desvioPadrao (vetor, media);
		
		System.out.println("o desvio padrão é " + desvio);
		
		
	
	}

	public static double mediaAritmetica(int[] vetor) {
		double media;
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma+=vetor[i];
		}
		media = soma / vetor.length;
		return media;
	}
	
	public static double desvioPadrao (int[] vetor, double media) {
		int i;
		double somat = 0;
		double desvioP;
		
		for (i=0; i<vetor.length; i++) {
			somat+= Math.pow(vetor[i] - media, 2);
		}
		desvioP=somat/(vetor.length-1);
		desvioP=Math.sqrt(desvioP);
		
		return desvioP;
	}

}
